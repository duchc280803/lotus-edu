package com.example.QuanLyVatTu.service;

import com.example.QuanLyVatTu.response.DsVatTuResponse;
import com.example.QuanLyVatTu.response.VatTuHetHangResponse;

import java.util.List;

public interface VatTuService {

    List<DsVatTuResponse> findAll();

    List<VatTuHetHangResponse> findAllVatTuHetHang();
}
