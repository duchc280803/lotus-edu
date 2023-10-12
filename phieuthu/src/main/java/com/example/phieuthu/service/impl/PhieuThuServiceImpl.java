package com.example.phieuthu.service.impl;

import com.example.phieuthu.entity.ChiTietPhieuThu;
import com.example.phieuthu.entity.NguyenLieu;
import com.example.phieuthu.entity.PhieuThu;
import com.example.phieuthu.payload.Converter.ChiTietPhieuThuConverter;
import com.example.phieuthu.payload.DTO.PhieuThuDTO;
import com.example.phieuthu.payload.Request.Request_ThemChiTietPhieuThu;
import com.example.phieuthu.payload.Request.Request_ThemPhieuThu;
import com.example.phieuthu.payload.Response.ResponseObject;
import com.example.phieuthu.repository.ChiTietPhieuThuRepository;
import com.example.phieuthu.repository.NguyenLieuRepository;
import com.example.phieuthu.repository.PhieuThuRepository;
import com.example.phieuthu.service.PhieuThuService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhieuThuServiceImpl implements PhieuThuService {
    private final ResponseObject<PhieuThuDTO> _responseObject;
    private  final ChiTietPhieuThuConverter _converter;
    @Autowired
    public PhieuThuServiceImpl(ResponseObject<PhieuThuDTO> responseObject, ChiTietPhieuThuConverter converter){
        _responseObject = responseObject;
        _converter = converter;
    }
    @Autowired
    private PhieuThuRepository phieuThuRepository;

    @Autowired
    private ChiTietPhieuThuRepository chiTietPhieuThuRepository;

    @Autowired
    private NguyenLieuRepository nguyenLieuRepository;

    @Override
    public ResponseObject<PhieuThuDTO> themPhieuThu(Request_ThemPhieuThu request) {
        PhieuThu phieuThu = new PhieuThu();
        phieuThu.setGhiChu(request.getGhiChu());
        phieuThu.setNgauLap(LocalDate.now());
        phieuThu.setNhanVienLap(request.getNhanVienLap());
        phieuThu.setThanhTien((float) 0);
        phieuThu.setChiTietPhieuThuList(null);
        phieuThuRepository.save(phieuThu);
        List<ChiTietPhieuThu> list = themListChiTietPhieuThu(phieuThu.getPhieuThuId(), request.getChiTietPhieuThuList());
        phieuThu.setChiTietPhieuThuList(list);
        float thanhTien = 0;
        for (var item: phieuThu.getChiTietPhieuThuList()) {
            thanhTien += item.getSoLuongBan() * item.getNguyenLieu().getGiaBan();
        }
        phieuThu.setThanhTien(thanhTien);
        phieuThuRepository.save(phieuThu);
        PhieuThuDTO phieuThuDTO = new PhieuThuDTO();
        phieuThuDTO.setThanhTien(phieuThu.getThanhTien());
        phieuThuDTO.setGhiChu(phieuThu.getGhiChu());
        phieuThuDTO.setNgauLap(phieuThu.getNgauLap());
        phieuThuDTO.setNhanVienLap(phieuThu.getNhanVienLap());
        phieuThuDTO.setChiTietPhieuThuDTOList(phieuThu.getChiTietPhieuThuList().stream().map(_converter::entityToDTO).collect(Collectors.toList()));
        return _responseObject.responseSuccess("Thêm phiếu thu thành công", phieuThuDTO);
    }

    @Override
    public List<ChiTietPhieuThu> themListChiTietPhieuThu(int phieuThuId, List<Request_ThemChiTietPhieuThu> requests) {
        var phieuThu = phieuThuRepository.findById(phieuThuId);
        if(phieuThu.isEmpty()){
            return  null;
        }
        List<ChiTietPhieuThu> list = new ArrayList<>();
        for (var chiTiet: requests) {
            ChiTietPhieuThu ct = new ChiTietPhieuThu();
            ct.setPhieuThu(phieuThu.get());
            ct.setSoLuongBan(chiTiet.getSoLuongBan());
            var nguyenLieu = nguyenLieuRepository.findById(chiTiet.getNguyenLieuId());
            if(nguyenLieu.isEmpty()){
                return  null;
            }
            ct.setNguyenLieu(nguyenLieu.get());
            list.add(ct);
        }
        chiTietPhieuThuRepository.saveAll(list);
        return list;
    }


//    @Override
//    public ChiTietPhieuThu createChiTietPhieu(ChiTietPhieuThu chiTietPhieuThu) {
//        return chiTietPhieuThuRepository.save(chiTietPhieuThu);
//    }
//
//    @Override
//    public void deletePhieu(Integer idPhieu) {
//        phieuThuRepository.deleteById(idPhieu);
//    }
//
    @Override
    @Transactional
    public PhieuThu themPhieuThu1(PhieuThu phieuThu) {
        PhieuThu savePhieuThu = phieuThuRepository.save(phieuThu);
        float thanhTien = 0;
        for (ChiTietPhieuThu chiTiet : savePhieuThu.getChiTietPhieuThuList()) {
            var nguyenLieu = nguyenLieuRepository.findById(chiTiet.getNguyenLieu().getNguyenLieuId());
            if(nguyenLieu.isEmpty()){
                return null;
            }
            chiTietPhieuThuRepository.save(chiTiet);
            nguyenLieu.get().setSoLuong(nguyenLieu.get().getSoLuong() - chiTiet.getSoLuongBan());
            thanhTien += chiTiet.getSoLuongBan() * nguyenLieu.get().getGiaBan();
            System.out.println(nguyenLieu.get().getGiaBan());
            nguyenLieuRepository.save(nguyenLieu.get());
        }
        savePhieuThu.setThanhTien(thanhTien);
        phieuThuRepository.save(savePhieuThu);

        return savePhieuThu;
    }
//
//    @Override
//    public List<PhieuThu> listPhieuByThoiGian(Integer thang) {
//        return null;
//    }
}
