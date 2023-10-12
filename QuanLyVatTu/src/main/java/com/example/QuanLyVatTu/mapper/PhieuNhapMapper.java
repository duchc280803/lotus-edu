package com.example.QuanLyVatTu.mapper;

import com.example.QuanLyVatTu.entity.PhieuNhap;
import com.example.QuanLyVatTu.request.PhieuNhapRequest;

public class PhieuNhapMapper {

    public static PhieuNhapRequest phieuNhapRequest(PhieuNhap phieuNhap) {
        return new PhieuNhapRequest(
                phieuNhap.getMaPhieu(),
                phieuNhap.getTieuDe(),
                phieuNhap.getNgayNhap());
    }

    public static PhieuNhap phieuNhap(PhieuNhapRequest phieuNhapRequest) {
        PhieuNhap phieuNhap = new PhieuNhap();
        phieuNhap.setTieuDe(phieuNhapRequest.getTieuDe());
        phieuNhap.setMaPhieu(phieuNhapRequest.getMaPhieu());
        phieuNhap.setNgayNhap(phieuNhapRequest.getNgayNhap());
        return phieuNhap;
    }
}
