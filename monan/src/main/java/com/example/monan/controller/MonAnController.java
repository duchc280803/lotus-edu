package com.example.monan.controller;

import com.example.monan.entity.CongThuc;
import com.example.monan.entity.MonAn;
import com.example.monan.service.impl.MonAnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mon-an/")
public class MonAnController {

    @Autowired
    private MonAnServiceImpl monAnService;

    @PostMapping("create")
    public ResponseEntity<MonAn> create(@RequestBody MonAn monAn) {
        return new ResponseEntity<>(monAnService.create(monAn), HttpStatus.CREATED);
    }

    @DeleteMapping("remove/{idMonAn}")
    public ResponseEntity<Void> remove(@PathVariable("idMonAn") Integer idMonAn) {
        monAnService.remove(idMonAn);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("find-mon")
    public ResponseEntity<List<MonAn>> findByMonAnOrNguyenLieu(
            @RequestParam(name = "tenMonAn") String tenMonAn,
            @RequestParam(name = "tenNguyenLieu") String tenNguyenLieu) {
        return new ResponseEntity<>(monAnService.findByMonAnOrNguyenLieu(tenMonAn, tenNguyenLieu), HttpStatus.OK);
    }
}
