package org.example.cuahangsach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiLieu {

    private Integer maTaiLieu;

    private String tenNhaSanXuat;

    private Integer soBanPhatHanh;

    private List<TaiLieu> list = new ArrayList<>();

    public TaiLieu() {

    }

    public TaiLieu(Integer maTaiLieu, String tenNhaSanXuat, Integer soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public Integer getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(Integer maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public Integer getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(Integer soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Mã Tài Liệu");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời Nhập Tên Nhà Sản Xuất");
        tenNhaSanXuat = scanner.nextLine();
        System.out.println("Mời Nhập Số Bản Phát Hành");
        soBanPhatHanh = Integer.parseInt(scanner.nextLine());
        list.add(new TaiLieu(maTaiLieu, tenNhaSanXuat, soBanPhatHanh));
    }

    public void inThongTin() {
        for (TaiLieu x : list) {
            System.out.println("Mã Tài Liệu Là: " + x.maTaiLieu);
            System.out.println("Tên Nhà Sản Xuất là: " + x.tenNhaSanXuat);
            System.out.println("Số Bản Phát Hành Là: " + x.soBanPhatHanh);
        }
    }

    public void timTaiLieuTheoTen(String ten) {
        for (TaiLieu x : list) {
            if (x.tenNhaSanXuat.equalsIgnoreCase(ten)) {
                System.out.println("Mã Tài Liệu Là: " + x.maTaiLieu);
                System.out.println("Tên Nhà Sản Xuất là: " + x.tenNhaSanXuat);
                System.out.println("Số Bản Phát Hành Là: " + x.soBanPhatHanh);
            }
        }
    }
}
