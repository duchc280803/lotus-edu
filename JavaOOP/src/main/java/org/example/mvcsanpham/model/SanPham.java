package org.example.mvcsanpham.model;

public class SanPham {

    private Integer maSanPham;

    private String ten;

    private LoaiSanPham loaiSanPham;

    private NhaCungCap nhaCungCap;

    public SanPham() {
    }

    public SanPham(Integer maSanPham, String ten, LoaiSanPham loaiSanPham, NhaCungCap nhaCungCap) {
        this.maSanPham = maSanPham;
        this.ten = ten;
        this.loaiSanPham = loaiSanPham;
        this.nhaCungCap = nhaCungCap;
    }

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }


}
