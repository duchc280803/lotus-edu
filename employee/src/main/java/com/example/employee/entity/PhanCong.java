package com.example.employee.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phan_cong")
public class PhanCong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1, message = "PhancongID phải là số nguyên dương")
    private Integer phanCongId;

    @ManyToOne
    @JoinColumn(name = "nhan_vien_id")
    @JsonBackReference
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "du_an_id")
    @JsonBackReference
    private DuAn duAn;

    private Integer soGioLam;
}
