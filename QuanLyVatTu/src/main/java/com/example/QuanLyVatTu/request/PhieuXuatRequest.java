package com.example.QuanLyVatTu.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhieuXuatRequest {

    private String maPhieu;

    private String tieuDe;

    private LocalDate ngayXuat;
}
