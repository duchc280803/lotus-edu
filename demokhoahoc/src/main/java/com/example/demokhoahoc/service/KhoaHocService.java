package com.example.demokhoahoc.service;

import com.example.demokhoahoc.entity.NgayHoc;

public interface KhoaHocService {

    NgayHoc create(NgayHoc ngayHoc, Integer idKhoa);

    void removeKhoaHoc(Integer idKhoaHoc);

    Integer tinhDoanhThu(Integer nam, Integer thang);
}
