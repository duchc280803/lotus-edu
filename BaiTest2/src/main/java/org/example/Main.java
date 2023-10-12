package org.example;

import java.util.Scanner;

public class Main {

    public static void baiOne() {
        Scanner scanner = new Scanner(System.in);
        double toan = scanner.nextDouble();
        double ly = scanner.nextDouble();
        double hoa = scanner.nextDouble();
        double tongBaMon = toan + ly + hoa;
        double toanLy = toan + ly;
        if (toan >= 6.5 && ly >= 5.5 && hoa >= 5.0) {
            System.out.println("Đủ tiêu chí");
        } else if (tongBaMon >= 18.0) {
            System.out.println("Đủ tiêu chí");
        } else if (toanLy >= 14.0) {
            System.out.println("Đủ tiêu chí");
        } else {
            System.out.println("Không Đủ Tiêu Chí");
        }
    }

    public static void baiHai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Vui Lòng Nhập Giá Trị Tại Ví Trí Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void baiBa() {
        Scanner scanner = new Scanner(System.in);
        double coSo = scanner.nextDouble();
        double luuThua = scanner.nextDouble();
        double kq = Math.pow(coSo, luuThua);
    }

    public static void main(String[] args) {
        baiHai();
    }
}