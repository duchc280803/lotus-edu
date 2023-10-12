package org.example.dondathangmvc.controller;

import org.example.dondathangmvc.model.ChiTietDonHang;
import org.example.dondathangmvc.model.DonDatHang;
import org.example.dondathangmvc.model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class DonDatHangController {

    private List<DonDatHang> donDatHangs = new ArrayList<>();

    private List<SanPham> sanPhams = new ArrayList<>();

    public void themSanPham(SanPham sanPham) {
        sanPhams.add(sanPham);
    }

    public void themDonDatHang(DonDatHang donDatHang) {
        donDatHangs.add(donDatHang);
    }

    public void themDonChiTietDatHang(ChiTietDonHang chiTietDonHang) {
        DonDatHang donDatHang = null;
        SanPham sanPham = null;

        for (DonDatHang ddh : donDatHangs) {
            if (ddh.getMaDonHang() == chiTietDonHang.getMaDDH()) {
                donDatHang = ddh;
                break;
            }
        }

        for (SanPham sp : sanPhams) {
            if (sp.getMaSp() == chiTietDonHang.getMaSP()) {
                sanPham = sp;
                break;
            }
        }

        if (donDatHang != null && sanPham != null) {
            ChiTietDonHang chiTietDonDatHang = new ChiTietDonHang();
            chiTietDonDatHang.setId(chiTietDonHang.getId());
            chiTietDonDatHang.setMaDDH(chiTietDonHang.getMaDDH());
            chiTietDonDatHang.setMaSP(chiTietDonHang.getMaSP());
            chiTietDonDatHang.setSoLuong(chiTietDonHang.getSoLuong());

            donDatHang.getList().add(chiTietDonDatHang);
        } else {
            System.out.println("DonDatHang or SanPham not found.");
        }
    }

    public void hienThiDon(int maDDH) {
        DonDatHang donDatHang = null;

        for (DonDatHang ddh : donDatHangs) {
            if (ddh.getMaDonHang() == maDDH) {
                donDatHang = ddh;
                break;
            }
        }

        if (donDatHang != null) {
            donDatHang.inThongTin();
            System.out.println("Chi tiet don dat hang:");
            for (ChiTietDonHang ct : donDatHang.getList()) {
                ct.inThongTin();
            }
        } else {
            System.out.println("DonDatHang not found.");
        }
    }

}
