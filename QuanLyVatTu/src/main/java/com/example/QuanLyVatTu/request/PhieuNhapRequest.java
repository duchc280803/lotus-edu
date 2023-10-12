package com.example.QuanLyVatTu.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhieuNhapRequest {

    private String maPhieu;

    private String tieuDe;

    private LocalDate ngayNhap;
}
