package com.example.hocsinh.controller;

import com.example.hocsinh.entity.HocSinh;
import com.example.hocsinh.service.impl.HocSinhServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HocSinhController {

    @Autowired
    private HocSinhServiceImpl hocSinhService;

    @PostMapping("create")
    public ResponseEntity<HocSinh> create(@RequestBody HocSinh hocSinh) {
        return new ResponseEntity<>(hocSinhService.themHocSinh(hocSinh), HttpStatus.CREATED);
    }

    @PostMapping("update/{id}")
    public ResponseEntity<HocSinh> update(@RequestBody HocSinh hocSinh, @PathVariable("id") Integer id) {
        return new ResponseEntity<>(hocSinhService.suaHocSinh(hocSinh, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        hocSinhService.xoaHocSinh(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("chuyen-lop/{id}")
    public ResponseEntity<HocSinh> chuyenLop(@RequestBody HocSinh hocSinh, @PathVariable("id") Integer id) {
        return new ResponseEntity<>(hocSinhService.chuyenLop(hocSinh, id), HttpStatus.OK);
    }
}
