package com.example.phieuthu.payload.Request;

import java.time.LocalDate;
import java.util.List;

public class Request_ThemPhieuThu {
    private String nhanVienLap;

    private String ghiChu;
    private List<Request_ThemChiTietPhieuThu> chiTietPhieuThuList;

    public List<Request_ThemChiTietPhieuThu> getChiTietPhieuThuList() {
        return chiTietPhieuThuList;
    }

    public void setChiTietPhieuThuList(List<Request_ThemChiTietPhieuThu> chiTietPhieuThuList) {
        this.chiTietPhieuThuList = chiTietPhieuThuList;
    }

    public String getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(String nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
