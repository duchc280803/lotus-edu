package com.example.phieuthu.payload.DTO;

import org.springframework.stereotype.Component;

@Component
public class ChiTietPhieuThuDTO {
    private int SoLuongBan;

    public int getSoLuongBan() {
        return SoLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        SoLuongBan = soLuongBan;
    }
}
