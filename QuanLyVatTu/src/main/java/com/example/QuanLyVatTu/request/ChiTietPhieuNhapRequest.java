package com.example.QuanLyVatTu.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChiTietPhieuNhapRequest {

    private Integer vatTuId;

    private Integer phieuNhapId;

    private Integer soLuongNhap;
}
