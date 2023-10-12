package org.example.cuahangsach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truyen extends TapChi {

    private String tenTruyen;

    private Integer ngayPhatHanh;

    private List<Truyen> list = new ArrayList<>();

    public Truyen(String tenTruyen, Integer ngayPhatHanh) {
        this.tenTruyen = tenTruyen;
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Truyen() {
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public Integer getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Integer ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Tên Truện");
        tenTruyen = scanner.nextLine();
        System.out.println("Mời Nhập Ngày Phát Hành");
        ngayPhatHanh = Integer.parseInt(scanner.nextLine());
        list.add(new Truyen(tenTruyen, ngayPhatHanh));
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        for (Truyen x : list) {
            System.out.println("Tên Truyện Là: " + x.tenTruyen);
            System.out.println("Ngày Phát Hành là: " + x.ngayPhatHanh);
        }
    }

    public void timTaiLieuTheoTen(String ten) {
        for (Truyen x : list) {
            if (x.tenTruyen.equalsIgnoreCase(ten)) {
                System.out.println("Tên Truyện Là: " + x.tenTruyen);
                System.out.println("Ngày Phát Hành là: " + x.ngayPhatHanh);
            }
        }
    }
}
