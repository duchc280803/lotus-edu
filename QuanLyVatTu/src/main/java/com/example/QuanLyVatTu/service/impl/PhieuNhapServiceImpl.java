package com.example.QuanLyVatTu.service.impl;

import com.example.QuanLyVatTu.entity.ChiTietPhieuNhap;
import com.example.QuanLyVatTu.entity.PhieuNhap;
import com.example.QuanLyVatTu.entity.VatTu;
import com.example.QuanLyVatTu.mapper.ChiTietPhieuNhapMapper;
import com.example.QuanLyVatTu.mapper.PhieuNhapMapper;
import com.example.QuanLyVatTu.repository.ChiTietPhieuNhapRepository;
import com.example.QuanLyVatTu.repository.PhieuNhapRepository;
import com.example.QuanLyVatTu.repository.VatTuRepository;
import com.example.QuanLyVatTu.request.PhieuNhapRequest;
import com.example.QuanLyVatTu.service.PhieuNhapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuNhapServiceImpl implements PhieuNhapService {

    @Autowired
    private PhieuNhapRepository phieuNhapRepository;

    @Autowired
    private ChiTietPhieuNhapRepository chiTietPhieuNhapRepository;

    @Autowired
    private VatTuRepository vatTuRepository;

    @Override
    public PhieuNhapRequest createPhieuNhap(PhieuNhapRequest phieuNhapRequest) {
        PhieuNhap phieuNhap = PhieuNhapMapper.phieuNhap(phieuNhapRequest);
        PhieuNhap phieuSave = phieuNhapRepository.save(phieuNhap);

        List<ChiTietPhieuNhap> chiTietPhieuNhapList = phieuSave.getChiTietPhieuNhapList();

        for (ChiTietPhieuNhap ct : chiTietPhieuNhapList) {
            chiTietPhieuNhapRepository.save(ct);
            VatTu vatTu = vatTuRepository.findById(ct.getVatTu().getVatTuId()).orElse(null);
            if (vatTu != null) {
                vatTu.setSoLuongTon(vatTu.getSoLuongTon() + ct.getSoLuongNhap());
                vatTuRepository.save(vatTu);
            } else {
                // Handle the case where vatTu is not found
            }
        }
        return PhieuNhapMapper.phieuNhapRequest(phieuSave);
    }
}
