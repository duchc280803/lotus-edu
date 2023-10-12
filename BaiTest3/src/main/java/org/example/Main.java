package org.example;

import java.util.Scanner;

public class Main {

    public static boolean soNguyenTo(int number) {
        if (number < 2) {
            return false;
        }

        int squa = (int) Math.sqrt(number);
        for (int i = 2; i < squa; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void bai1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Lượng Phần Tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ " + i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (soNguyenTo(arr[i])) {
                System.out.println("Các Số Nguyên Tố" + arr[i]);
            }
        }
    }

    public static void bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Lượng Phần Tử: ");
        int n = scanner.nextInt();
        int tang = 1;
        String np = Integer.toBinaryString(n);
        for (int i = 0; i < np.length(); i++) {
            int digit = Character.getNumericValue(np.charAt(i));
            if (digit == 1) {
                int[] arr1 = new int[tang++];
                arr1[i] = digit;
                System.out.println("Mảng 1" + arr1[i]);
            } else {
                int[] arr2 = new int[tang++];
                arr2[i] = digit;
                System.out.println("Mảng 2" + arr2[i]);
            }
        }
    }

    public static void bai3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Lượng Phần Tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ " + i);
            arr[i] = scanner.nextInt();
        }
        double trungBinh = 0;
        for (int i = 0; i < n; i++) {
            trungBinh = (double) arr[i] / n;
            System.out.println(trungBinh);
        }
    }

    public static void main(String[] args) {
        bai1();
    }
}