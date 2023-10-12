package org.example.mvchocsinh.service;

import org.example.mvchocsinh.model.Diem;
import org.example.mvchocsinh.model.HocSinh;
import org.example.mvchocsinh.model.MonHoc;

import java.util.List;

public interface DiemService {

    HocSinh createHocSinh(HocSinh hocSinh);

    MonHoc createMonHoc(MonHoc monHoc);

    void chamDiem(Integer maHocSinh, Integer maMonHoc, Double diem);

    void bangDiem(Integer maHocSinh);

    void tongKetMon(Integer maMonHoc);

    void inThongTinHocSinh();

    void inThongTinMonHoc();
}
