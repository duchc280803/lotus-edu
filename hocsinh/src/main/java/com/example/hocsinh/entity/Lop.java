package com.example.hocsinh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lop")
public class Lop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lopId;

    private String tenLop;

    private Integer siSo;

    @OneToMany(mappedBy = "lop", fetch = FetchType.LAZY)
    private List<HocSinh> list ;
}
