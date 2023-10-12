package com.example.phieuthu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "phieu_thu")
public class PhieuThu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer phieuThuId;

    private LocalDate ngauLap;

    private String nhanVienLap;

    private String ghiChu;

    private Float thanhTien;

    @OneToMany(mappedBy = "phieuThu", fetch = FetchType.LAZY)
    private List<ChiTietPhieuThu> chiTietPhieuThuList;
}
