package org.example.mvcsanpham.model;

public class LoaiSanPham {

    private Integer maLoai;

    private String tenLoai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(Integer maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public Integer getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(Integer maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public void inThongTin() {
        System.out.println("Mã Loại: " + maLoai + "," + " Tên Loại: " + tenLoai);
    }
}
