package com.example.nhanvien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhan_vien")
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nhanVienId;

    private String hoTen;

    private Integer sdt;

    private String diaChi;

    private Integer heSoLuong;

    @OneToMany(mappedBy = "phanCong", fetch = FetchType.LAZY)
    private List<PhanCong> list;
}
