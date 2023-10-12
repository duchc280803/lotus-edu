package org.example.cuahangsach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends TaiLieu {

    private String tenTapChi;

    private Integer soPhatHanh;

    private Integer thangPhatHang;

    private List<TapChi> list = new ArrayList<>();

    public TapChi() {

    }

    public TapChi(String tenTapChi, Integer soPhatHanh, Integer thangPhatHang) {
        this.tenTapChi = tenTapChi;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHang = thangPhatHang;
    }

    public String getTenTapChi() {
        return tenTapChi;
    }

    public void setTenTapChi(String tenTapChi) {
        this.tenTapChi = tenTapChi;
    }

    public Integer getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(Integer soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public Integer getThangPhatHang() {
        return thangPhatHang;
    }

    public void setThangPhatHang(Integer thangPhatHang) {
        this.thangPhatHang = thangPhatHang;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Tên Tạp Chí");
        tenTapChi = scanner.nextLine();
        System.out.println("Mời Nhập Số Phát Hành");
        soPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời Nhập Tháng Phát Hành");
        thangPhatHang = Integer.parseInt(scanner.nextLine());
        list.add(new TapChi(tenTapChi, soPhatHanh, thangPhatHang));
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        for (TapChi x : list) {
            System.out.println("Tên Tạp Chí Là: " + x.tenTapChi);
            System.out.println("Số Phát Hành là: " + x.soPhatHanh);
            System.out.println("Tháng Phát Hành Là: " + x.thangPhatHang);
        }
    }

    public void timTaiLieuTheoTen(String ten) {
        for (TapChi x : list) {
            if (x.tenTapChi.equalsIgnoreCase(ten)) {
                System.out.println("Tên Tạp Chí Là: " + x.tenTapChi);
                System.out.println("Số Phát Hành là: " + x.soPhatHanh);
                System.out.println("Tháng Phát Hành Là: " + x.thangPhatHang);
            }
        }
    }
}
