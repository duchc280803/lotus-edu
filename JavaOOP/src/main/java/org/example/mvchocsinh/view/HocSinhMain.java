package org.example.mvchocsinh.view;

import org.example.mvchocsinh.controller.DiemController;

import java.util.Scanner;

public class HocSinhMain {

    private static DiemController diemController = new DiemController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập Học Sinh Và Hiển Thị Học Sinh");
            System.out.println("2. Nhập Môn Học Và Hiển Thị Môn Học");
            System.out.println("3. Chấm Điểm");
            System.out.println("4. Bảng Điểm");
            System.out.println("5. Tổng Kết Môn");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    diemController.themHocSinh();
                    diemController.inThongTinHocSinh();
                    break;
                case 2:
                    diemController.themMonHoc();
                    diemController.inThongTinMonHoc();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Mời Nhập Mã Học Sinh");
                    int maHs = Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời Nhập Mã Môn Học");
                    int maMon = Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời Nhập Điểm");
                    double diem = Double.parseDouble(scanner.nextLine());
                    diemController.chamDiem(maHs, maMon, diem);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Mời Nhập Mã Học Sinh");
                    int maHocS = Integer.parseInt(scanner.nextLine());
                    diemController.bangDiem(maHocS);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Mời Nhập Mã Môn Học");
                    int maMonHoc = Integer.parseInt(scanner.nextLine());
                    diemController.tongKetMon(maMonHoc);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
            }
        } while (true);
    }
}
