package com.example.hocsinh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hoc_sinh")
public class HocSinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hocSinhID;

    @ManyToOne
    @JoinColumn(name = "lop_id")
    private Lop lop;

    private String hoTen;

    private LocalDate ngaySinh;

    private String queQuan;
}
