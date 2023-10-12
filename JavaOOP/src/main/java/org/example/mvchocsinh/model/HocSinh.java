package org.example.mvchocsinh.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HocSinh {

    private Integer maHocSinh;

    private String ten;

    private LocalDate ngaySinh;

    private List<Diem> diemList = new ArrayList<>();

    private List<MonHoc> monHocList = new ArrayList<>();

    public HocSinh() {
    }

    public HocSinh(Integer maHocSinh, String ten, LocalDate ngaySinh) {
        this.maHocSinh = maHocSinh;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public Integer getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(Integer maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public List<Diem> getDiemList() {
        return diemList;
    }

    public void setDiemList(List<Diem> diemList) {
        this.diemList = diemList;
    }
}
