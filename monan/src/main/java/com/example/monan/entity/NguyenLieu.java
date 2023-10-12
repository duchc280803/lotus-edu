package com.example.monan.entity;

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
@Table(name = "nguyen_lieu")
public class NguyenLieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNguyenLieu;

    private String tenNguyenLieu;

    private String ghiChu;

    @OneToMany(mappedBy = "nguyenLieu", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CongThuc> list;

}
