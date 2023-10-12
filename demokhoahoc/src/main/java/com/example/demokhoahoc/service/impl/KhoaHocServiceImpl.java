package com.example.demokhoahoc.service.impl;

import com.example.demokhoahoc.entity.KhoaHoc;
import com.example.demokhoahoc.entity.NgayHoc;
import com.example.demokhoahoc.repository.HocVienRepository;
import com.example.demokhoahoc.repository.KhoaHocRepository;
import com.example.demokhoahoc.repository.NgayHocRepostiory;
import com.example.demokhoahoc.service.KhoaHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class KhoaHocServiceImpl implements KhoaHocService {

    @Autowired
    private KhoaHocRepository khoaHocRepository;

    @Autowired
    private NgayHocRepostiory ngayHocRepostiory;

    @Autowired
    private HocVienRepository hocVienRepository;

    @Override
    public NgayHoc create(NgayHoc ngayHoc, Integer idKhoa) {
        KhoaHoc findbyKhoaHoc = khoaHocRepository.findById(idKhoa).orElse(null);
        if (findbyKhoaHoc.getNgayHocList().size() < 15) {
            ngayHocRepostiory.save(ngayHoc);
            return ngayHoc;
        }
        return null;
    }

    @Override
    public void removeKhoaHoc(Integer idKhoaHoc) {
        khoaHocRepository.deleteById(idKhoaHoc);
    }

    @Override
    public Integer tinhDoanhThu(Integer nam, Integer thang) {
        int doanhThuThang = 0;

        for (KhoaHoc khoaHoc : khoaHocRepository.findAll()) {
            Calendar calendarStart = Calendar.getInstance();
            calendarStart.setTime(khoaHoc.getNgayBatDau());

            Calendar calendarEnd = Calendar.getInstance();
            calendarEnd.setTime(khoaHoc.getNgayKetThuc());

            int namStart = calendarStart.get(Calendar.YEAR);
            int thangStart = calendarStart.get(Calendar.MONTH) + 1;

            int namEnd = calendarEnd.get(Calendar.YEAR);
            int thangEnd = calendarEnd.get(Calendar.MONTH) + 1;

            if ((namStart == nam && thangStart == thang) || (namEnd == nam && thangEnd == thang)) {
                int soHocVien = khoaHoc.getHocVienList().size();
                int hocPhi = khoaHoc.getHocPhi();
                int doanhThuKhoaHoc = soHocVien * hocPhi;
                doanhThuThang += doanhThuKhoaHoc;
            }
        }

        return doanhThuThang;
    }
}
