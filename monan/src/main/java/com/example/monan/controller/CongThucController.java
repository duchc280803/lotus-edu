package com.example.monan.controller;

import com.example.monan.entity.CongThuc;
import com.example.monan.service.impl.CongThucServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cong-thuc/")
public class CongThucController {

    @Autowired
    private CongThucServiceImpl congThucService;

    @PostMapping("create")
    public ResponseEntity<CongThuc> create(
            @RequestBody CongThuc congThuc,
            @RequestParam(name = "idMonAn") Integer idMonAn,
            @RequestParam(name = "idNguyenLieu") Integer idNguyenLieu
    ) {
        return new ResponseEntity<>(congThucService.create(congThuc, idMonAn, idNguyenLieu), HttpStatus.CREATED);
    }
}
