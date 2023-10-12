package com.example.QuanLyVatTu.mapper;

import com.example.QuanLyVatTu.entity.ChiTietPhieuNhap;
import com.example.QuanLyVatTu.request.ChiTietPhieuNhapRequest;

public class ChiTietPhieuNhapMapper {

    public static ChiTietPhieuNhap entityToMapper(ChiTietPhieuNhapRequest chiTietPhieuNhapRequest) {
        ChiTietPhieuNhap chiTietPhieuNhap = new ChiTietPhieuNhap();
        chiTietPhieuNhap.getVatTu().setVatTuId(chiTietPhieuNhapRequest.getVatTuId());
        chiTietPhieuNhap.getPhieuNhap().setPhieuNhapId(chiTietPhieuNhapRequest.getPhieuNhapId());
        chiTietPhieuNhap.setSoLuongNhap(chiTietPhieuNhapRequest.getSoLuongNhap());
        return chiTietPhieuNhap;
    }
}
