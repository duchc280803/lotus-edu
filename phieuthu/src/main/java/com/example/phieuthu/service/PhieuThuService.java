package com.example.phieuthu.service;

import com.example.phieuthu.entity.ChiTietPhieuThu;
import com.example.phieuthu.entity.PhieuThu;
import com.example.phieuthu.payload.DTO.ChiTietPhieuThuDTO;
import com.example.phieuthu.payload.DTO.PhieuThuDTO;
import com.example.phieuthu.payload.Request.Request_ThemChiTietPhieuThu;
import com.example.phieuthu.payload.Request.Request_ThemPhieuThu;
import com.example.phieuthu.payload.Response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PhieuThuService {

//    ChiTietPhieuThu createChiTietPhieu(ChiTietPhieuThu chiTietPhieuThu);
//
//    void deletePhieu(Integer idPhieu);
//
//    PhieuThu themPhieuThu(PhieuThu phieuThu);
//
//    List<PhieuThu> listPhieuByThoiGian(Integer thang);

    PhieuThu themPhieuThu1(PhieuThu phieuThu);
ResponseObject<PhieuThuDTO> themPhieuThu(Request_ThemPhieuThu request);
List<ChiTietPhieuThu> themListChiTietPhieuThu(int phieuThuId, List<Request_ThemChiTietPhieuThu> requests);

}
