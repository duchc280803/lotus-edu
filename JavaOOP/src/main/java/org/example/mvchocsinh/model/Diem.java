package org.example.mvchocsinh.model;

public class Diem {

    private Integer maHocSinh;

    private Integer maMonHoc;

    public Double diem;

    private HocSinh hocSinh;

    public Diem() {
    }

    public Diem(Integer maHocSinh, Integer maMonHoc, Double diem) {
        this.maHocSinh = maHocSinh;
        this.maMonHoc = maMonHoc;
        this.diem = diem;
    }

    public Integer getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(Integer maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public Integer getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(Integer maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public HocSinh getHocSinh() {
        return hocSinh;
    }

    public void setHocSinh(HocSinh hocSinh) {
        this.hocSinh = hocSinh;
    }
}
