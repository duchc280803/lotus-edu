package com.example.hocsinh.service.impl;

import com.example.hocsinh.entity.HocSinh;
import com.example.hocsinh.entity.Lop;
import com.example.hocsinh.repository.HocSinhRepository;
import com.example.hocsinh.repository.LopRepository;
import com.example.hocsinh.service.HocSinhService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocSinhServiceImpl implements HocSinhService {

    @Autowired
    private HocSinhRepository hocSinhRepository;

    @Autowired
    private LopRepository lopRepository;

    @Override
    @Transactional
    public HocSinh themHocSinh(HocSinh hocSinh) {
        List<Lop> findAll = lopRepository.findAll();
        for (Lop l : findAll) {
            if (l.getSiSo() < 20) {
                List<HocSinh> list = l.getList();
                hocSinhRepository.save(hocSinh);
                l.setSiSo(list.size());
                lopRepository.save(l);
                return hocSinh;
            }
        }
        return null;
    }

    @Override
    @Transactional
    public HocSinh suaHocSinh(HocSinh hocSinh, Integer id) {
        HocSinh findById = hocSinhRepository.findById(id).orElse(null);

        if (findById != null) {
            findById.setLop(hocSinh.getLop());
            findById.setHoTen(hocSinh.getHoTen());
            findById.setNgaySinh(hocSinh.getNgaySinh());
            findById.setQueQuan(hocSinh.getQueQuan());
            hocSinhRepository.save(findById);

            List<Lop> findAll = lopRepository.findAll();
            for (Lop l : findAll) {
                List<HocSinh> list = l.getList();
                l.setSiSo(list.size());
            }

            return findById;
        } else {
            return null;
        }
    }


    @Override
    public void xoaHocSinh(Integer id) {
        hocSinhRepository.deleteById(id);
        List<Lop> findAll = lopRepository.findAll();
        for (Lop l : findAll) {
            List<HocSinh> list = l.getList();
            l.setSiSo(list.size());
        }
    }

    @Override
    @Transactional
    public HocSinh chuyenLop(HocSinh hocSinh, Integer id) {
        HocSinh findById = hocSinhRepository.findById(id).orElse(null);
        findById.setLop(hocSinh.getLop());
        hocSinhRepository.save(hocSinh);
        List<Lop> findAll = lopRepository.findAll();
        for (Lop l : findAll) {
            List<HocSinh> list = l.getList();
            l.setSiSo(list.size());
        }
        return hocSinh;
    }
}
