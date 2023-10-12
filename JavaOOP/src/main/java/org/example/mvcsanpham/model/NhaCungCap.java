package org.example.mvcsanpham.model;

public class NhaCungCap {

    private Integer nhaCungCap;

    private String ten;

    private Integer soDienThoai;

    public NhaCungCap() {
    }

    public NhaCungCap(Integer nhaCungCap, String ten, Integer soDienThoai) {
        this.nhaCungCap = nhaCungCap;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public Integer getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(Integer nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(Integer soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void inThongTin() {
        System.out.println("Mã Cung Cấp: " + nhaCungCap + "," + "Tên Nhà Cung Cấp: " + ten);
    }
}
