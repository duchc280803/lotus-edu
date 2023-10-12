package com.example.demokhoahoc.service;

import com.example.demokhoahoc.entity.HocVien;

public interface HocVienService {

    HocVien update(HocVien hocVien, Integer idHocVien);

    HocVien findByNameOrKhoaHoc(String value);
}
