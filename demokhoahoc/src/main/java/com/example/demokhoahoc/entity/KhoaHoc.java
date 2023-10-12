package com.example.demokhoahoc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "khoa_hoc")
public class KhoaHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer khoaHocId;

    @Max(value = 10, message = "Không Được Quá 10 ký tự")
    private String tenKhoaHoc;

    private String mota;

    @Max(value = 10000000, message = "Học phí không được lớn hơn 10 triệu")
    private Integer hocPhi;

    private Date ngayBatDau;

    private Date ngayKetThuc;

    @OneToMany(mappedBy = "khoaHoc", fetch = FetchType.LAZY)
    private List<HocVien> hocVienList;

    @OneToMany(mappedBy = "khoaHoc", fetch = FetchType.LAZY)
    private List<NgayHoc> ngayHocList;

}
