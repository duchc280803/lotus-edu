package com.example.phieuthu.service.impl;

import com.example.phieuthu.entity.NguyenLieu;
import com.example.phieuthu.repository.NguyenLieuRepository;
import com.example.phieuthu.service.NguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguyenLieuServiceImpl implements NguyenLieuService {

    @Autowired
    private NguyenLieuRepository nguyenLieuRepository;

//    @Override
//    public NguyenLieu createNguyenLieu(NguyenLieu nguyenLieu) {
//        nguyenLieuRepository.save(nguyenLieu);
//        return nguyenLieu;
//    }
}
