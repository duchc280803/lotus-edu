package com.example.hocsinh.service;

import com.example.hocsinh.entity.HocSinh;

public interface HocSinhService {

    HocSinh themHocSinh(HocSinh hocSinh);

    HocSinh suaHocSinh(HocSinh hocSinh, Integer id);

    void xoaHocSinh(Integer id);

    HocSinh chuyenLop(HocSinh hocSinh, Integer id);
}
