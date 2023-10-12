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
@Table(name = "phieu_xuat")
public class PhieuXuat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phieuXuatId;

    private String maPhieu;

    private String tieuDe;

    private LocalDate ngayXuat;

    @OneToMany(mappedBy = "phieuXuat", fetch = FetchType.LAZY)
    private List<ChiTietPhieuXuat> chiTietPhieuXuatList;
}
