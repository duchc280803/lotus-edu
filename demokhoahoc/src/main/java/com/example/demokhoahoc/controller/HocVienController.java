package com.example.demokhoahoc.controller;

import com.example.demokhoahoc.entity.HocVien;
import com.example.demokhoahoc.service.impl.HocVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hoc-vien/")
public class HocVienController {

    @Autowired
    private HocVienServiceImpl hocVienService;

    @PutMapping("update/{idHocVien}")
    public ResponseEntity<HocVien> update(@RequestBody HocVien hocVien, @PathVariable("idHocVien") Integer idHocVien) {
        return new ResponseEntity<>(hocVienService.update(hocVien, idHocVien), HttpStatus.OK);
    }

    @GetMapping("tim-kiem/{value}")
    public ResponseEntity<HocVien> findByNameOrKhoaHoc(@PathVariable("value") String value) {
        return new ResponseEntity<>(hocVienService.findByNameOrKhoaHoc(value), HttpStatus.OK);
    }
}
