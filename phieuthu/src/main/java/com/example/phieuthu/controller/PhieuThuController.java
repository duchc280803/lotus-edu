package com.example.phieuthu.controller;

import com.example.phieuthu.entity.ChiTietPhieuThu;
import com.example.phieuthu.entity.PhieuThu;
import com.example.phieuthu.payload.DTO.PhieuThuDTO;
import com.example.phieuthu.payload.Request.Request_ThemPhieuThu;
import com.example.phieuthu.payload.Response.ResponseObject;
import com.example.phieuthu.service.impl.PhieuThuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phieu-thu/")
public class PhieuThuController {

    @Autowired
    private PhieuThuServiceImpl phieuThuService;

    @PostMapping("create-phieu")
    public ResponseObject<PhieuThuDTO> createPhieu(@RequestBody Request_ThemPhieuThu request) {
        return phieuThuService.themPhieuThu(request);
    }
//
    @PostMapping("create-detail-phieu")
    public ResponseEntity<PhieuThu> createChiTietPhieu(@RequestBody PhieuThu phieuThu) {
        return new ResponseEntity<>(phieuThuService.themPhieuThu1(phieuThu), HttpStatus.CREATED);
    }
//
//    @DeleteMapping("delete/{id}")
//    public ResponseEntity<PhieuThu> delete(@PathVariable("id") Integer id) {
//        phieuThuService.deletePhieu(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }

}
