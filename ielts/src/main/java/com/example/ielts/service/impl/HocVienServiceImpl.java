package com.example.ielts.service.impl;

import com.example.ielts.entity.HocVien;
import com.example.ielts.repository.HocVienRepository;
import com.example.ielts.repository.LopRepository;
import com.example.ielts.service.HocVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocVienServiceImpl implements HocVienService {

    @Autowired
    private HocVienRepository hocVienRepository;

    @Override
    public List<HocVien> findAllHocVienWithNgayDangKyDesc() {
        return hocVienRepository.findAllHocVienWithNgayDangKyDesc();
    }

    @Override
    public List<HocVien> findHocVien2002WithName(String name) {
        return hocVienRepository.findHocVien2002WithName(name);
    }

    @Override
    public HocVien create(HocVien hocVien) {
        hocVienRepository.save(hocVien);
        return hocVien;
    }

    @Override
    public HocVien update(HocVien hocVien, Integer idHocVien) {
        HocVien findByHocVien = hocVienRepository.findById(idHocVien).orElse(null);
        if (findByHocVien != null) {
            findByHocVien.setEmail(hocVien.getEmail());
            findByHocVien.setDiaChi(hocVien.getDiaChi());
            findByHocVien.setSoDienThoai(hocVien.getSoDienThoai());
            findByHocVien.setGioiTinh(hocVien.isGioiTinh());
            findByHocVien.setHoVaTen(hocVien.getHoVaTen());
            findByHocVien.setNgaySinh(hocVien.getNgaySinh());
            return findByHocVien;
        }
        return null;
    }

    @Override
    public void delete(Integer idHocVien) {
        hocVienRepository.deleteById(idHocVien);
    }
}
