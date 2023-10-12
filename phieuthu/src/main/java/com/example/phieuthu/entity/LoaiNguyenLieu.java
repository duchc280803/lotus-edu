package com.example.phieuthu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "loai_nguyen_lieu")
public class LoaiNguyenLieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loaiNguyenLieuId;

    private String tenLoai;

    private String moTa;

    @OneToMany(mappedBy = "loaiNguyenLieu", fetch = FetchType.LAZY)
    private List<NguyenLieu> nguyenLieuList;

}
