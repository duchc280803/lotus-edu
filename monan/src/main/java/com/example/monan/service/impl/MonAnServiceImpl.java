package com.example.monan.service.impl;

import com.example.monan.entity.CongThuc;
import com.example.monan.entity.MonAn;
import com.example.monan.repository.CongThucRepository;
import com.example.monan.repository.MonAnRepository;
import com.example.monan.service.MonAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonAnServiceImpl implements MonAnService {

    @Autowired
    private MonAnRepository monAnRepository;

    @Autowired
    private CongThucRepository congThucRepository;

    @Override
    public MonAn create(MonAn monAn) {
        monAnRepository.save(monAn);
        return monAn;
    }

    @Override
    public void remove(Integer idMonAn) {
        monAnRepository.deleteById(idMonAn);
    }

    @Override
    public List<MonAn> findByMonAnOrNguyenLieu(String tenMonAn, String tenNguyenLieu) {
        List<MonAn> lst = new ArrayList<>();
        monAnRepository.findAll().forEach(x -> {
            if (x.getTenMon().toLowerCase().contains(tenMonAn.toLowerCase())) {
                x.getListCongThuc().forEach(c -> {
                    if (c.getNguyenLieu().getTenNguyenLieu().toLowerCase().contains(tenNguyenLieu.toLowerCase())) {
                        lst.add(x);
                    }
                });
            }
        });
        return lst;
    }
}
