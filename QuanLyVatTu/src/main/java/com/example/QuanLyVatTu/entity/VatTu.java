package com.example.QuanLyVatTu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vat_tu")
public class VatTu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vatTuId;

    private String tenVatTu;

    private Integer soLuongTon;

    @OneToMany(mappedBy = "vatTu", fetch = FetchType.LAZY)
    private List<ChiTietPhieuNhap> chiTietPhieuNhapList;

    @OneToMany(mappedBy = "vatTu", fetch = FetchType.LAZY)
    private List<ChiTietPhieuXuat> chiTietPhieuXuatList;
}
