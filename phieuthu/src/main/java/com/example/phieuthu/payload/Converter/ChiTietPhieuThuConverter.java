package com.example.phieuthu.payload.Converter;

import com.example.phieuthu.entity.ChiTietPhieuThu;
import com.example.phieuthu.payload.DTO.ChiTietPhieuThuDTO;
import org.springframework.stereotype.Component;

@Component
public class ChiTietPhieuThuConverter {
    public ChiTietPhieuThuDTO entityToDTO(ChiTietPhieuThu ct){
        ChiTietPhieuThuDTO chiTiet = new ChiTietPhieuThuDTO();
        chiTiet.setSoLuongBan(ct.getSoLuongBan());
        return chiTiet;
    }
}
