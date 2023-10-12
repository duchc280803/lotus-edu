package com.example.monan.service.impl;

import com.example.monan.entity.CongThuc;
import com.example.monan.entity.MonAn;
import com.example.monan.entity.NguyenLieu;
import com.example.monan.repository.CongThucRepository;
import com.example.monan.repository.MonAnRepository;
import com.example.monan.repository.NguyenLieuRepository;
import com.example.monan.service.CongThucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CongThucServiceImpl implements CongThucService {

    @Autowired
    private CongThucRepository congThucRepository;

    @Autowired
    private MonAnRepository monAnRepository;

    @Autowired
    private NguyenLieuRepository nguyenLieuRepository;

    @Override
    public CongThuc create(CongThuc congThuc, Integer idMonAn, Integer idNguyenLieu) {
        NguyenLieu findByNguyenLieu = nguyenLieuRepository.findById(idNguyenLieu).orElse(null);
        MonAn findByMonAn = monAnRepository.findById(idMonAn).orElse(null);
        CongThuc congThucSave = new CongThuc();
        congThucSave.setMonAn(findByMonAn);
        congThucSave.setNguyenLieu(findByNguyenLieu);
        congThucSave.setDonViTinh(congThuc.getDonViTinh());
        congThucSave.setSoLuong(congThuc.getSoLuong());
        congThucRepository.save(congThucSave);
        if (findByMonAn != null) {
            findByMonAn.setCachLam(findByMonAn.getCachLam() + "\n" +
                    nguyenLieuRepository.findById(idNguyenLieu).get().getTenNguyenLieu() + ":" + congThuc.getSoLuong());
            monAnRepository.save(findByMonAn);
        }
        return congThucSave;
    }
}
