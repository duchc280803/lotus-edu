package org.example;

import java.time.LocalDate;
import java.util.List;

public class HocVien {

    private Integer maHocVien;

    private String hoTen;

    private LocalDate ngaySinh;

    private String ho;

    private Double hocPhi;

    private String email;

    public HocVien() {
    }

    public HocVien(Integer maHocVien, String hoTen, LocalDate ngaySinh, Double hocPhi) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        String[] parts = hoTen.split(" ");
        if (parts.length >= 1) {
            this.ho = parts[0];
        }
        this.hocPhi = hocPhi;
        if (this.hocPhi > 3000000) {
            this.hocPhi *= 0.5;
        }
        this.email = this.hoTen.replace(" ", "").toLowerCase() + "@edusolution.com";
    }

    public Integer getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(Integer maHocVien) {
        this.maHocVien = maHocVien;
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

    public Double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(Double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public void inThongTin() {
        System.out.println("Mã Học Viên: " + getMaHocVien() + "Có Tên: " + getHoTen() + "Có Email: " + email);
    }

    public static void timKiemHocVien(List<HocVien> list, Integer maTim) {
        for (HocVien x : list) {
            if (x.getMaHocVien().equals(maTim)) {
                System.out.println(
                        "Mã Học Viên: " + x.getMaHocVien()
                                + ", Có Tên: " + x.getHoTen()
                                + ", Có Email: " + x.email
                                + ", Có Ngày Sinh: " + x.getNgaySinh()
                                + ", Có Học Phí Là: " + x.getHocPhi());
            }
        }
    }
}
