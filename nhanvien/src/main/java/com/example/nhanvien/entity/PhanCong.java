package com.example.nhanvien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phan_cong")
public class PhanCong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phanCongId;

    @ManyToOne
    @JoinColumn(name = "nhan_vien_id")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "du_an_id")
    private DuAn duAn;

    private Integer soGioLam;
}
