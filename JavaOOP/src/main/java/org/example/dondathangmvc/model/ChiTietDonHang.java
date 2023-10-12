package org.example.dondathangmvc.model;

import org.example.dondathangmvc.helper.InputHelper;

public class ChiTietDonHang {

    private Integer id;

    private Integer maDDH;

    private Integer maSP;

    private Integer soLuong;

    public ChiTietDonHang() {
        System.out.println("Mời Nhập ID");
        id = InputHelper.readInt();
        System.out.println("Mời Nhập Mã Đơn Hàng");
        maDDH = InputHelper.readInt();
        System.out.println("Mời Nhập Mã Sản Phẩm");
        maSP = InputHelper.readInt();
        System.out.println("Mời Nhập Số Lượng");
        soLuong = InputHelper.readInt();
    }

    public ChiTietDonHang(Integer id, Integer maDDH, Integer maSP, Integer soLuong) {
        this.id = id;
        this.maDDH = maDDH;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaDDH() {
        return maDDH;
    }

    public void setMaDDH(Integer maDDH) {
        this.maDDH = maDDH;
    }

    public Integer getMaSP() {
        return maSP;
    }

    public void setMaSP(Integer maSP) {
        this.maSP = maSP;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public void inThongTin() {
        System.out.println("Id: " + getId());
        System.out.println("Mã Đơn Đặt Hàng: " + getMaDDH());
        System.out.println("Mã Sản Phẩm: " + getMaSP());
        System.out.println("Số Lượng: " + getSoLuong());
    }
}
