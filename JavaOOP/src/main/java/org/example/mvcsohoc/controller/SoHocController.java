package org.example.mvcsohoc.controller;

import org.example.mvcsohoc.model.SoHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoHocController {

    private List<SoHoc> danhSachSo = new ArrayList<>();

    public void taoNgauNhien(int N) {
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            int giaTri = random.nextInt(100);
            SoHoc so = new SoHoc(giaTri);
            danhSachSo.add(so);
        }
    }

    public void hienThiTatCa() {
        for (SoHoc so : danhSachSo) {
            so.inThongTin();
        }
    }

    public void hienThiSoChan() {
        for (SoHoc so : danhSachSo) {
            if (so.getLaSoChan()) so.inThongTin();
        }
    }

    public void hienThiSoLe() {
        for (SoHoc so : danhSachSo) {
            if (!so.getLaSoLe()) so.inThongTin();
        }
    }

    public void hienThiSoNguyenTo() {
        for (SoHoc so : danhSachSo) {
            if (so.getLaSoNguyenTo()) so.inThongTin();
        }
    }

    public void hienThiSoDoiXung() {
        for (SoHoc so : danhSachSo) {
            if (so.getLaSoDoiXung()) so.inThongTin();
        }
    }
}
