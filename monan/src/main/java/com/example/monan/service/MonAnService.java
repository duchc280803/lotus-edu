package com.example.monan.service;

import com.example.monan.entity.CongThuc;
import com.example.monan.entity.MonAn;

import java.util.List;

public interface MonAnService {

    MonAn create(MonAn monAn);

    void remove(Integer idMonAn);

    List<MonAn> findByMonAnOrNguyenLieu(String tenMonAn, String tenNguyenLieu);
}
