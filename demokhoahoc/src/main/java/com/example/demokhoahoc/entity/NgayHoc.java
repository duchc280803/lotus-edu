package com.example.demokhoahoc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "ngay_hoc")
public class NgayHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ngayHocId;

    @ManyToOne
    @JoinColumn(name = "khoahocidnh")
    private KhoaHoc khoaHoc;

    private String noiDung;

    private String ghiChu;
}
