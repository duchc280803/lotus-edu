package com.example.ielts.controller;

import com.example.ielts.entity.HocVien;
import com.example.ielts.service.impl.HocVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HocVienController {

    @Autowired
    private HocVienServiceImpl hocVienService;

    @GetMapping("danh-sach-theo-ngay")
    public ResponseEntity<List<HocVien>> danhSachTheoNgay() {
        return new ResponseEntity<>(hocVienService.findAllHocVienWithNgayDangKyDesc(), HttpStatus.OK);
    }

    @GetMapping("danh-sach-list/{name}")
    public ResponseEntity<List<HocVien>> danhSachList(@PathVariable("name") String name) {
        return new ResponseEntity<>(hocVienService.findHocVien2002WithName(name), HttpStatus.OK);
    }

    @PostMapping("create/{idHocVien}")
    public ResponseEntity<HocVien> create(@RequestBody HocVien hocVien) {
        return new ResponseEntity<>(hocVienService.create(hocVien), HttpStatus.CREATED);
    }

    @PostMapping("update/{idHocVien}")
    public ResponseEntity<HocVien> update(@RequestBody HocVien hocVien, @PathVariable("idHocVien") Integer idHocVien) {
        return new ResponseEntity<>(hocVienService.update(hocVien, idHocVien), HttpStatus.OK);
    }

    @DeleteMapping("delete/{idHocVien}")
    public ResponseEntity<Void> delete(@PathVariable("idHocVien") Integer idHocVien) {
        hocVienService.delete(idHocVien);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
