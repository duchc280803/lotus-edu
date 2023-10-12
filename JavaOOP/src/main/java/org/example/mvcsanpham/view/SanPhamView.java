package org.example.mvcsanpham.view;

import org.example.mvcsanpham.controller.SanPhamController;
import org.example.mvcsanpham.model.SanPham;

import java.util.Scanner;

public class SanPhamView {

    private static SanPhamController sanPhamController = new SanPhamController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiện sản phẩm của loại");
            System.out.println("3. Hiện sản phẩm của nhà cung cấp");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SanPham sanPham = new SanPham();
                    sanPhamController.themSanPham(sanPham);
                    sanPhamController.inThongTin();
                    break;
                case 2:
                    System.out.println("Mời Nhâp Mã Loại");
                    int maLoai = scanner.nextInt();
                    sanPhamController.hienLoai(maLoai);
                    break;
                case 3:
                    System.out.println("Mời Nhập Tên Nhà Cung Cấp");
                    int maNcc = scanner.nextInt();
                    sanPhamController.hienNcc(maNcc);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
            }
        } while (true);
    }
}
