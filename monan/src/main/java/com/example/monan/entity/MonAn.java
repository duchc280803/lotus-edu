package com.example.monan.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "mon_an")
public class MonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMonAn;

    @ManyToOne
    @JoinColumn(name = "loai_mon_an_Id")
    @JsonBackReference
    private LoaiMonAn loaiMonAn;

    private String tenMon;

    private Float giaBan;

    private String gioiThieu;

    private String cachLam;

    @OneToMany
    private List<CongThuc> listCongThuc;
}
