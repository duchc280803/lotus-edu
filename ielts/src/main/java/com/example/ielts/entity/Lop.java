package com.example.ielts.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lop")
public class Lop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLop;

    private String lop;

    private String trinhDo;

    private LocalDate ngayDangKy;

    @ManyToOne
    @JoinColumn(name = "idHocVien")
    @JsonBackReference
    private HocVien hocVien;
}
