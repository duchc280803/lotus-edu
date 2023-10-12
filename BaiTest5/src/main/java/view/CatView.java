package view;

import controller.CatController;
import model.Cat;

import java.util.Scanner;

public class CatView {

    private static Scanner scanner = new Scanner(System.in);

    private static CatController catController = new CatController();

    private static void menu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Thêm mèo.");
            System.out.println("2.Xóa Mèo theo ID.");
            System.out.println("3.Hiển thị toàn bộ mèo.");
            System.out.println("4.Hiển thị mèo theo ID.");
            System.out.println("5.Thay đổi tiếng kêu theo ID.");
            System.out.println("6.Thoát chương trình.\n");
            System.out.println("Mời Nhập Case: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Cat cat = new Cat();
                    catController.themMeo(cat);
                    break;
                case 2:
                    System.out.println("Mời Nhập Mã Mèo Cần Xóa");
                    int idMeo = scanner.nextInt();
                    catController.delete(idMeo);
                    break;
                case 3:
                    catController.hienThi();
                    break;
                case 4:
                    System.out.println("Mời Nhập Mã Con Mèo Cần Hiển Thị");
                    int id = scanner.nextInt();
                    catController.hienThiTheoId(id);
                    break;
                case 5:
                    System.out.println("Mời Nhập Mã Con Mèo Cần Thay Đổi Tiếng Kêu");
                    int idKeu = scanner.nextInt();
                    catController.thayDoiTiengKeu(idKeu);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
