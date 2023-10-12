package com.example.QuanLyVatTu.service.impl;

import com.example.QuanLyVatTu.entity.VatTu;
import com.example.QuanLyVatTu.repository.VatTuRepository;
import com.example.QuanLyVatTu.response.DsVatTuResponse;
import com.example.QuanLyVatTu.response.VatTuHetHangResponse;
import com.example.QuanLyVatTu.service.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VatTuServiceImpl implements VatTuService {

    @Autowired
    private VatTuRepository vatTuRepository;

    @Override
    public List<DsVatTuResponse> findAll() {
        List<DsVatTuResponse> responseList = new ArrayList<>();
        for (VatTu vt: vatTuRepository.findAll()){
            String status = (vt.getSoLuongTon() == 0 ? "Hết Hàng" : String.valueOf(vt.getSoLuongTon()));
            DsVatTuResponse dsVatTuResponse = new DsVatTuResponse(vt.getTenVatTu(), status);
            responseList.add(dsVatTuResponse);
        }
        return responseList;
    }

    @Override
    public List<VatTuHetHangResponse> findAllVatTuHetHang() {
        List<VatTuHetHangResponse> responseList = new ArrayList<>();
        for (VatTu vt: vatTuRepository.findAll()){
            if (vt.getSoLuongTon() == 0) {
                VatTuHetHangResponse vatTuHetHangResponse = new VatTuHetHangResponse(vt.getTenVatTu());
                responseList.add(vatTuHetHangResponse);
            }
        }
        return responseList;
    }
}
