package com.example.monan.service;

import com.example.monan.entity.CongThuc;

public interface CongThucService {

    CongThuc create(CongThuc congThuc, Integer idMonAn, Integer idNguyenLieu);
}
