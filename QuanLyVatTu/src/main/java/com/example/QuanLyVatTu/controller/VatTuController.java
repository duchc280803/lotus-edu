package com.example.QuanLyVatTu.controller;

import com.example.QuanLyVatTu.response.DsVatTuResponse;
import com.example.QuanLyVatTu.response.VatTuHetHangResponse;
import com.example.QuanLyVatTu.service.impl.VatTuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vat-tu/")
public class VatTuController {

    @Autowired
    private VatTuServiceImpl vatTuService;

    @GetMapping("show")
    public ResponseEntity<List<DsVatTuResponse>> findAll() {
        return ResponseEntity.ok(vatTuService.findAll());
    }

    @GetMapping("show-het-hang")
    public ResponseEntity<List<VatTuHetHangResponse>> findAllVatTuHetHang() {
        return ResponseEntity.ok(vatTuService.findAllVatTuHetHang());
    }
}
