package com.example.QuanLyVatTu.controller;

import com.example.QuanLyVatTu.request.PhieuNhapRequest;
import com.example.QuanLyVatTu.service.impl.PhieuNhapServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phieu-nhap/")
public class PhieuNhapController {

    @Autowired
    private PhieuNhapServiceImpl phieuNhapService;

    @PostMapping("create")
    public ResponseEntity<PhieuNhapRequest> createPhieuNhap(@RequestBody PhieuNhapRequest phieuNhapRequest) {
        return new ResponseEntity<>(phieuNhapService.createPhieuNhap(phieuNhapRequest), HttpStatus.CREATED);
    }
}
