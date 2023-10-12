package com.example.employee.service;

import com.example.employee.entity.DuAn;
import com.example.employee.entity.NhanVien;
import com.example.employee.entity.PhanCong;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> listNhanVien();

    PhanCong create(PhanCong phanCong, Integer duAnId);

    DuAn update(DuAn duAn, Integer id);

    void delete(Integer id);

    double tinhLuong();

}
