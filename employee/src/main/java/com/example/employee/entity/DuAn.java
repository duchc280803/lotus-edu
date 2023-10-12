package com.example.employee.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
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
@Table(name = "du_an")
public class DuAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1, message = "DuanID phải là số nguyên dương")
    private Integer duAnId;

    @Size(max = 10, message = "Tenduan không được quá 10 ký tự")
    private String tenDuAn;

    private String moTa;

    private String ghiChu;

    @OneToMany(mappedBy = "duAn", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<PhanCong> phanCongs;
}
