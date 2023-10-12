package com.example.monan.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
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
@Table(name = "loai_mon_an")
public class LoaiMonAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLoai;

    private String tenLoai;

    private String moTa;

    @OneToMany(mappedBy = "loaiMonAn", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<MonAn> list;
}
