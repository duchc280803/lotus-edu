package com.example.demokhoahoc.service.impl;

import com.example.demokhoahoc.entity.HocVien;
import com.example.demokhoahoc.repository.HocVienRepository;
import com.example.demokhoahoc.service.HocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HocVienServiceImpl implements HocVienService {

    @Autowired
    private HocVienRepository hocVienRepository;

    @Override
    public HocVien update(HocVien hocVien, Integer idHocVien) {
        HocVien findByHocVien = hocVienRepository.findById(idHocVien).orElse(null);
        if (findByHocVien != null) {
            findByHocVien.setKhoaHoc(hocVien.getKhoaHoc());
            findByHocVien.setDiaChi(hocVien.getDiaChi());
            findByHocVien.setHoTen(hocVien.getHoTen());
            findByHocVien.setNgaySinh(hocVien.getNgaySinh());
            findByHocVien.setQueQuan(hocVien.getQueQuan());
            findByHocVien.setSoDienThoai(hocVien.getSoDienThoai());
            return findByHocVien;
        }
        return null;
    }

    @Override
    public HocVien findByNameOrKhoaHoc(String value) {
        return hocVienRepository.findByNameOrKhoa(value);
    }
}
