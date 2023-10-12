package org.example.dondathangmvc.model;

import org.example.dondathangmvc.helper.InputHelper;

public class SanPham {

    private Integer maSp;

    private String tenSp;

    private Float giaBan;

    private String ghiChu;

    public SanPham() {
        System.out.println("Mời Nhập Mã Sản Phẩm");
        maSp = InputHelper.readInt();
        System.out.println("Mời Nhập Tên Sản Phẩm");
        tenSp = InputHelper.readString();
        System.out.println("Mời Nhập Giá Sản Phẩm");
        giaBan = InputHelper.readFloat();
        System.out.println("Mời Nhập Ghi Chú Sản Phẩm");
        ghiChu = InputHelper.readString();
    }

    public SanPham(Integer maSp, String tenSp, Float giaBan, String ghiChu) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.ghiChu = ghiChu;
    }

    public Integer getMaSp() {
        return maSp;
    }

    public void setMaSp(Integer maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Float giaBan) {
        this.giaBan = giaBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void inThongTin() {
        System.out.println("Mã Sản Phẩm: " + getMaSp());
        System.out.println("Tên Sản Phẩm: " + getTenSp());
        System.out.println("Giá Sản Phẩm: " + getGiaBan());
        System.out.println("Ghi Chú Sản Phẩm: " + getGhiChu());
    }
}
