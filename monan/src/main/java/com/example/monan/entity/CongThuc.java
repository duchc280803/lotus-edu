package com.example.monan.entity;

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
@Table(name = "cong_thuc")
public class CongThuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCongThuc;

    @ManyToOne
    @JoinColumn(name = "nguyen_lieu_Id")
    @JsonBackReference
    private NguyenLieu nguyenLieu;

    @ManyToOne
    @JoinColumn(name = "mon_an_Id")
    @JsonBackReference
    private MonAn monAn;

    private Integer soLuong;

    private String donViTinh;

}
