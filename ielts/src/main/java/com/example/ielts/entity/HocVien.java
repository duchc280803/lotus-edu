package com.example.ielts.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hoc_vien")
public class HocVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHocVien;

    private String hoVaTen;

    private LocalDate ngaySinh;

    private boolean gioiTinh;

    private String email;

    private Integer soDienThoai;

    private String diaChi;

    @OneToMany(mappedBy = "hocVien", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Lop> listLop;

}
