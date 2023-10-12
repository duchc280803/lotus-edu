package org.example.dondathangmvc.model;

import org.example.dondathangmvc.helper.InputHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DonDatHang {

    private Integer maDonHang;

    private String soHieuDon;

    private LocalDate ngayTao;

    private List<ChiTietDonHang> list = new ArrayList<>();

    public DonDatHang() {
        System.out.println("Mời Nhập Mã Đơn Hàng");
        maDonHang = InputHelper.readInt();
        System.out.println("Mời Nhập Số Hiệu Đơn");
        soHieuDon = InputHelper.readString();
        System.out.println("Mời Nhập Ngày Tạo");
        ngayTao = LocalDate.parse(InputHelper.readString());
    }

    public DonDatHang(Integer maDonHang, String soHieuDon, LocalDate ngayTao) {
        this.maDonHang = maDonHang;
        this.soHieuDon = soHieuDon;
        this.ngayTao = ngayTao;
    }

    public Integer getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(Integer maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getSoHieuDon() {
        return soHieuDon;
    }

    public void setSoHieuDon(String soHieuDon) {
        this.soHieuDon = soHieuDon;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public List<ChiTietDonHang> getList() {
        return list;
    }

    public void setList(List<ChiTietDonHang> list) {
        this.list = list;
    }

    public void inThongTin() {
        System.out.println("Mã Đơn Đặt Hàng" + getMaDonHang());
        System.out.println("Số Hiệu Đơn Đặt Hàng" + getSoHieuDon());
        System.out.println("Ngày Tạo Đơn Đặt Hàng" + getNgayTao());
    }
}
