package com.example.demokhoahoc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "hoc_vien")
public class HocVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hocVienId;

    @ManyToOne
    @JoinColumn(name = "khoahocidhv")
    private KhoaHoc khoaHoc;

    @Max(value = 20 , message = "Không Được Quá 20 Ký Tự")
    @Pattern(regexp = "^[\\p{L}]+( [\\p{L}]+)+$", message = "Phải có ít nhất 2 từ")
    private String hoTen;

    private String queQuan;

    private LocalDate ngaySinh;

    private String diaChi;

    private Integer soDienThoai;
}
