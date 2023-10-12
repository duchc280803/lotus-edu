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
@Table(name = "du_an")
public class DuAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer duAnId;

    private String tenDuAn;

    private String moTa;

    private String ghiChu;

    @OneToMany(mappedBy = "duAn", fetch = FetchType.LAZY)
    private List<PhanCong> list;
}
