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
@Table(name = "chi_tiet_phieu_thu")
public class ChiTietPhieuXuat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietXuatThuId;

    @ManyToOne
    @JoinColumn(name = "vat_tu_id")
    private VatTu vatTu;

    @ManyToOne
    @JoinColumn(name = "phieu_xuat_id")
    private PhieuXuat phieuXuat;

    private Integer soLuongXuat;
}
