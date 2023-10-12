package org.example;

import java.util.Scanner;

public class SessionTam {

    public static boolean xuLy(int number) {
        int giaTriVao = number;
        int bienGan = 0;
        while (number > 0) {
            int first = number % 10;
            bienGan = bienGan * 10 + first;
            number /= 10;
        }
        return giaTriVao == bienGan;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            if (xuLy(x)) {
                sum += x;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập số lượng phần tử");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn giá trị vị trí thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        int kq = sum(arr);
        System.out.println(kq);
    }

}
