package com.example.phieuthu.payload.DTO;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class PhieuThuDTO {
    private LocalDate ngauLap;

    private String nhanVienLap;

    private String ghiChu;

    private Float thanhTien;
    private List<ChiTietPhieuThuDTO> chiTietPhieuThuDTOList;

    public LocalDate getNgauLap() {
        return ngauLap;
    }

    public void setNgauLap(LocalDate ngauLap) {
        this.ngauLap = ngauLap;
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

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public List<ChiTietPhieuThuDTO> getChiTietPhieuThuDTOList() {
        return chiTietPhieuThuDTOList;
    }

    public void setChiTietPhieuThuDTOList(List<ChiTietPhieuThuDTO> chiTietPhieuThuDTOList) {
        this.chiTietPhieuThuDTOList = chiTietPhieuThuDTOList;
    }
}
