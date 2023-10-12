package org.example;

import java.util.*;

public class Main {


    public static void hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Lượng Phần Tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ " + i);
            arr[i] = scanner.nextInt();
        }
        sapXepNoiBot(arr);
        for (Integer x : arr) {
            System.out.println(x);
        }
    }

    public static void timPhanTuChanDauTien() {
        int[] arr = {1, 4, 7, 8, 9, 6, 3, 2, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static double tich(double a, double b) {
        return a * b;
    }

    public static boolean LaSoChinhPhuong(double number) {
        double can = Math.sqrt(number);
        if (can * can == number) {
            return true;
        }
        return false;
    }

    public static int nhapSoNguyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Nguyên: ");
        int n = 0;
        boolean kt = false;
        while (!kt) {
            try {
                n = scanner.nextInt();
                kt = true;
            } catch (Exception e) {
                System.out.println("Nhập Sai");
                scanner.nextLine();
            }
        }
        return n;
    }

    public static String nhapChuoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Nguyên: ");
        String str = "";
        boolean kt = false;
        while (!kt) {
            try {
                str = scanner.nextLine();
                kt = true;
            } catch (Exception e) {
                System.out.println("Nhập Sai");
                scanner.nextLine();
            }
        }
        return str;
    }

    public static void phuongTrinhBachai(double a, double b, double c) {
        double detail = Math.pow(b, 2) - 4 * a * c;
        double x1 = 0.0;
        double x2 = 0.0;
        if (detail > 0) {
            System.out.println("Phương trình có 2 nghiệm");
            x1 = (-b + Math.sqrt(detail) / 2 * a);
            x2 = (-b - Math.sqrt(detail) / 2 * a);
        }
        System.out.println(detail);
        System.out.println(x1);
        System.out.println(x2);
    }

    public static void daoNguocDanhSach() {
        List<String> list = new ArrayList<>();
        list.add("Nguyen Duc Toan");
        list.add("Nguyen Hoang Truong");
        list.add("Nguyen Dong Khanh");
        Collections.reverse(list);
        for (String x : list) {
            System.out.println(x);
        }
    }

    public static void tongCacPhanTuMang() {
        int[] arr = {1, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void soNhoNhatTrongBaSo() {
        double a = 3.3;
        double b = 3.1;
        double c = 3.2;
        Math.min(Math.min(a, b), c);
    }

    public static int generateRandomInt(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static void nhapXuatCoBan() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (Integer x : arr) {
            System.out.println(x);
        }
    }

    public static void chuanHoaChuoi() {
        String str = " Nguyen van     a ";
        str = str.trim();
        str = str.replaceAll("\\s+", " "); //  thay thế chuỗi (\\s+ tìm kiếm tất cả khoảng trắng)
        System.out.println(upper(str));
    }

    public static String upper(String input) {
        String outPut = input.substring(0, 1).toUpperCase() + input.substring(1);
        return outPut;
    }

    public static void vietHoa() {
        String str = " nguyen        van   Toan";
        str = str.trim();
        System.out.println(upperToWork(str));
    }

    public static String upperToWork(String input) {
        String[] arr = input.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }
        return String.join(" ", arr);
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void sapXepNoiBot(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void danhSachSoNguyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Số Lượng Phần Tử");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Mời Nhập Giá Trị Mảng Ở vị Trí Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        for (Integer x : arr) {
            System.out.println("Mảng Vừa Nhập Là" + x);
        }

        for (int i = 0; i < number; i++) {

        }

        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        for (Integer x : arr) {
            System.out.println("Mảng Sau Khi Sắp Xếp Là" + x);
        }
    }

    public static void main(String args[]) {
        danhSachSoNguyen();
    }
}