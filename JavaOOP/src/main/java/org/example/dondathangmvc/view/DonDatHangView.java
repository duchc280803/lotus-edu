package org.example.dondathangmvc.view;

import org.example.dondathangmvc.controller.DonDatHangController;
import org.example.dondathangmvc.helper.InputHelper;
import org.example.dondathangmvc.model.ChiTietDonHang;
import org.example.dondathangmvc.model.DonDatHang;
import org.example.dondathangmvc.model.SanPham;

public class DonDatHangView {

    private static DonDatHangController controller = new DonDatHangController();

    public static void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n*** MENU ***");
            System.out.println("1. Them don hang");
            System.out.println("2. Them san pham");
            System.out.println("3. Them chi tiet don hang");
            System.out.println("4. Hien thi thong tin don hang");
            System.out.println("5. Thoat");
            System.out.println("Mời Nhập Lựa Chọn");
            int choice = InputHelper.readInt();

            switch (choice) {
                case 1:
                    DonDatHang donDatHang = new DonDatHang();
                    controller.themDonDatHang(donDatHang);
                    break;
                case 2:
                    SanPham sanPham = new SanPham();
                    controller.themSanPham(sanPham);
                    break;
                case 3:
                    ChiTietDonHang chiTietDonDatHang = new ChiTietDonHang();
                    controller.themDonChiTietDatHang(chiTietDonDatHang);
                    break;
                case 4:
                    System.out.println("Mời Nhập Mã Đơn Đặt Hàng");
                    int MaDDH = InputHelper.readInt();
                    controller.hienThiDon(MaDDH);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1997; i > 0; i /= 10) {
            sum += i % 10;
            System.out.println(sum);
        }
    }
}
