package com.example.ielts.service;

import com.example.ielts.entity.HocVien;

import java.util.List;

public interface HocVienService {

    List<HocVien> findAllHocVienWithNgayDangKyDesc();

    List<HocVien> findHocVien2002WithName(String name);

    HocVien create(HocVien hocVien);

    HocVien update(HocVien hocVien, Integer idHocVien);

    void delete(Integer idHocVien);
}
