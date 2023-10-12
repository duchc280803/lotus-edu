package com.example.employee.service.impl;

import com.example.employee.entity.DuAn;
import com.example.employee.entity.NhanVien;
import com.example.employee.entity.PhanCong;
import com.example.employee.repository.DuAnRepository;
import com.example.employee.repository.NhanVienRepository;
import com.example.employee.repository.PhanCongRepository;
import com.example.employee.service.NhanVienService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private DuAnRepository duAnRepository;

    @Autowired
    private PhanCongRepository phanCongRepository;

    @Override
    public List<NhanVien> listNhanVien() {
        return nhanVienRepository.findAll();
    }

    public PhanCong create(PhanCong phanCong, Integer duAnId) {
        DuAn duAn = duAnRepository.findById(duAnId).orElse(null);
        if (duAn != null) {
            NhanVien nhanVien = new NhanVien();
            nhanVienRepository.save(nhanVien);
            phanCong.setNhanVien(nhanVien);
            phanCong.setDuAn(duAn);
            phanCongRepository.save(phanCong);
            return phanCong;
        }
        return null;
    }

    @Override
    @Transactional
    public DuAn update(DuAn duAn, Integer id) {
        DuAn existingDuAn = duAnRepository.findById(id).orElse(null);
        if (existingDuAn != null) {
            existingDuAn.setTenDuAn(duAn.getTenDuAn());
            existingDuAn.setGhiChu(duAn.getGhiChu());
            existingDuAn.setMoTa(duAn.getMoTa());
            duAnRepository.save(existingDuAn);
            return existingDuAn;
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public double tinhLuong() {
        List<NhanVien> listNhanVien = nhanVienRepository.findAll();
        List<PhanCong> listPhanCong = phanCongRepository.findAll();
        double totalLuong = 0.0;

        for (NhanVien x : listNhanVien) {
            double tongGio = 0.0;
            for (PhanCong pc : listPhanCong) {
                if (x.getNhanVienId().equals(pc.getNhanVien().getNhanVienId())) {
                    tongGio += pc.getSoGioLam();
                }
            }
            totalLuong += tongGio * 15 * x.getHeSoLuong();
        }

        return totalLuong;
    }

}
