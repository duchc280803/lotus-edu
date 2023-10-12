package org.example.mvchocsinh.controller;

import org.example.mvchocsinh.model.HocSinh;
import org.example.mvchocsinh.model.MonHoc;
import org.example.mvchocsinh.service.DiemService;
import org.example.mvchocsinh.service.impl.DiemServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class DiemController {

    private DiemService diemService = new DiemServiceImpl();

    public void themHocSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Học Sinh");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên Học Sinh");
        String ten = scanner.nextLine();
        System.out.println("Nhập Ngày Học Sinh");
        String ngay = scanner.nextLine();
        LocalDate date = LocalDate.parse(ngay);
        HocSinh hocSinh = new HocSinh(ma, ten, date);
        diemService.createHocSinh(hocSinh);
    }

    public void themMonHoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã Môn Học");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên Môn Học");
        String ten = scanner.nextLine();
        System.out.println("Nhập Số Tiêt Học Sinh");
        int soTiet = Integer.parseInt(scanner.nextLine());
        MonHoc monHoc = new MonHoc(ma, ten, soTiet);
        diemService.createMonHoc(monHoc);
    }

    public void chamDiem(Integer maHocSinh, Integer maMonHoc, Double diem) {
        diemService.chamDiem(maHocSinh, maMonHoc, diem);
    }

    public void bangDiem(Integer maHocSinh) {
        diemService.bangDiem(maHocSinh);
    }

    public void tongKetMon(Integer maMonHoc) {
        diemService.tongKetMon(maMonHoc);
    }

    public void inThongTinHocSinh() {
        diemService.inThongTinHocSinh();
    }

    public void inThongTinMonHoc() {
        diemService.inThongTinMonHoc();
    }

}
