package com.example.demokhoahoc.controller;

import com.example.demokhoahoc.service.impl.KhoaHocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/khoa-hoc/")
public class KhoaHocController {

    @Autowired
    private KhoaHocServiceImpl khoaHocService;

    @DeleteMapping("remove/{idKhoaHoc}")
    public ResponseEntity<Void> remove(@PathVariable("idKhoaHoc") Integer idKhoaHoc) {
        khoaHocService.removeKhoaHoc(idKhoaHoc);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("doanh-thu")
    public int getDoanhThu(@RequestParam int nam, @RequestParam int thang) {
        return khoaHocService.tinhDoanhThu(nam, thang);
    }
}