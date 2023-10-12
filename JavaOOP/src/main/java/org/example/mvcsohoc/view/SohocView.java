package org.example.mvcsohoc.view;

import org.example.mvcsohoc.controller.SoHocController;
import org.example.mvcsohoc.model.SoHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SohocView {

    private static SoHocController soHocController = new SoHocController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập N số");
            System.out.println("2. Hiển Thị Tất Cả");
            System.out.println("3. Hiển Thị Sô Chẵn");
            System.out.println("4. Hiển Thị Số Lẻ");
            System.out.println("5. Hiển Thị số Nguyên Tố");
            System.out.println("6. Hiển Thị Số Đối Xứng");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập N số");
                    int number = scanner.nextInt();
                    soHocController.taoNgauNhien(number);
                    break;
                case 2:
                    System.out.println("Hiển Thị Tất Cả");
                    soHocController.hienThiTatCa();
                    break;
                case 3:
                    System.out.println("Hiển Thị Sô Chẵn");
                    soHocController.hienThiSoChan();
                    break;
                case 4:
                    System.out.println("Hiển Thị Số Lẻ");
                    soHocController.hienThiSoLe();
                    break;
                case 5:
                    System.out.println("Hiển Thị số Nguyên Tố");
                    soHocController.hienThiSoNguyenTo();
                    break;
                case 6:
                    System.out.println("Hiển Thị Số Đối Xứng");
                    soHocController.hienThiSoDoiXung();
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
