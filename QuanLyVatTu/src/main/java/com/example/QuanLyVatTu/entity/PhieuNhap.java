package com.example.QuanLyVatTu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "phieu_nhap")
public class PhieuNhap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phieuNhapId;

    private String maPhieu;

    private String tieuDe;

    private LocalDate ngayNhap;

    @OneToMany(mappedBy = "phieuNhap", fetch = FetchType.LAZY)
    private List<ChiTietPhieuNhap> chiTietPhieuNhapList;

}
