package com.example.QuanLyVatTu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chi_tiet_phieu_nhap")
public class ChiTietPhieuNhap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietPhieuNhapId;

    @ManyToOne
    @JoinColumn(name = "vat_tu_id")
    private VatTu vatTu;

    @ManyToOne
    @JoinColumn(name = "phieu_nhap_id")
    private PhieuNhap phieuNhap;

    private Integer soLuongNhap;
}
