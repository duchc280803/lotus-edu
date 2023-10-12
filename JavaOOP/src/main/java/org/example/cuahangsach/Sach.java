package org.example.cuahangsach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach extends TaiLieu {

    private String tenSach;

    private String tenTacGia;

    private Integer soTrang;

    private List<Sach> list = new ArrayList<>();

    public Sach() {

    }

    public Sach(String tenSach, String tenTacGia, Integer soTrang) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Integer getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(Integer soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Tên Sách");
        tenSach = scanner.nextLine();
        System.out.println("Mời Nhập Tên Tác Giả");
        tenTacGia = scanner.nextLine();
        System.out.println("Mời Nhập Số Trang");
        soTrang = Integer.parseInt(scanner.nextLine());
        list.add(new Sach(tenSach, tenTacGia, soTrang));
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        for (Sach x : list) {
            System.out.println("Tên Sách Là: " + x.tenSach);
            System.out.println("Tên Tác Giả Là: " + x.tenTacGia);
            System.out.println("Số Trang là: " + x.soTrang);
        }
    }

    public void timTaiLieuTheoTen(String ten) {
        for (Sach x : list) {
            if (x.tenSach.equalsIgnoreCase(ten)) {
                System.out.println("Tên Sách Là: " + x.tenSach);
                System.out.println("Tên Tác Giả Là: " + x.tenTacGia);
                System.out.println("Số Trang là: " + x.soTrang);
            }
        }
    }
}
