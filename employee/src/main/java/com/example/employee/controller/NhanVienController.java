package com.example.employee.controller;

import com.example.employee.entity.DuAn;
import com.example.employee.entity.NhanVien;
import com.example.employee.entity.PhanCong;
import com.example.employee.service.impl.NhanVienServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NhanVienController {

    @Autowired
    private NhanVienServiceImpl nhanVienService;

    @GetMapping("getAll")
    public ResponseEntity<List<NhanVien>> findAll() {
        return new ResponseEntity(nhanVienService.listNhanVien(), HttpStatus.OK);
    }

    @PostMapping("create/{duAnId}")
    public ResponseEntity<PhanCong> create(@Valid @RequestBody PhanCong phanCong, @PathVariable("duAnId") Integer duAnId) {
        return new ResponseEntity(nhanVienService.create(phanCong, duAnId), HttpStatus.CREATED);
    }

    @PutMapping("update/{duAnId}")
    public ResponseEntity<PhanCong> update(@Valid @RequestBody DuAn duAn, @PathVariable("duAnId") Integer duAnId) {
        return new ResponseEntity(nhanVienService.update(duAn, duAnId), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        nhanVienService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("tinhLuong")
    public double tinhLuong(@PathVariable Integer nhanVienId) {
        return nhanVienService.tinhLuong();
    }

}
