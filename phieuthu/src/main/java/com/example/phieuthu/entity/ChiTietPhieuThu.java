package com.example.phieuthu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "chi_tiet_phieu_thu")
public class ChiTietPhieuThu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietPhieuThuId;

    @ManyToOne
    @JoinColumn(name = "id_nguyen_lieu")
    private NguyenLieu nguyenLieu;

    @ManyToOne
    @JoinColumn(name = "id_phieu_thu")
    private PhieuThu phieuThu;

    private Integer soLuongBan;
}
