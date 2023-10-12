package com.example.phieuthu.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "nguyen_lieu")
public class NguyenLieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nguyenLieuId;

    @ManyToOne
    @JoinColumn(name = "id_loai")
    private LoaiNguyenLieu loaiNguyenLieu;

    private String tenNguyenLieu;

    private String donViTinh;

    private Float giaBan;

    private Integer soLuong;

    @OneToMany(mappedBy = "nguyenLieu", fetch = FetchType.LAZY)
    private List<ChiTietPhieuThu> chiTietPhieuThuList;
}
