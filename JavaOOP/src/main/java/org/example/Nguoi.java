package org.example;

import java.time.LocalDate;

public class Nguoi {

    private Integer maSo;

    private String hoTen;

    private LocalDate ngaySinh;

    private String ho;

    private String tenDem;

    private String ten;

    public Nguoi() {
    }

    public Nguoi(Integer maSo, String hoTen, LocalDate ngaySinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        String[] parts = hoTen.split(" ");
        if (parts.length >= 1) {
            this.ho = parts[0];
        }
        if (parts.length >= 2) {
            this.tenDem = parts[1];
        }
        if (parts.length >= 3) {
            this.ten = parts[2];
        }
    }

    public Integer getMaSo() {
        return maSo;
    }

    public void setMaSo(Integer maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHo() {
        return ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void inThongTin() {
        System.out.println("MaSo co ten la " + maSo + " sinh ngay " + ngaySinh);
        System.out.println(hoTen = getHo() + " " + getTenDem() + " " + getTen());
    }

    public void TaoDuLieuHoTen(String hoMoi, String demMoi, String tenMoi) {
        if (hoTen != null && !hoTen.isEmpty()) {
            hoTen = hoMoi + " " + demMoi + " " + tenMoi;
        } else {
            hoTen = hoMoi + " " + demMoi + " " + tenMoi;
        }
        System.out.println(hoTen = hoMoi + " " + demMoi + " " + tenMoi);
    }
}
