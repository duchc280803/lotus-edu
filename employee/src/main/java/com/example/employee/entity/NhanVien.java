package com.example.employee.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhan_vien")
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1, message = "NhanvienID phải là số nguyên dương")
    private Integer nhanVienId;

    @Size(max = 20, message = "Hoten không được quá 20 ký tự")
    @Pattern(regexp = "^[\\p{L}]+[\\p{L} ]+$", message = "Hoten phải có ít nhất 2 từ")
    private String hoTen;

    private Integer sdt;

    private String diaChi;

    private Float heSoLuong;

    @OneToMany(mappedBy = "nhanVien", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<PhanCong> phanCongs;
}
