package org.example;

import java.util.Scanner;

public class SessionTen {

    public static int xuLy(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int giaiThua = 1;
            for (int j = 1; j <= arr[i]; j++) {
                giaiThua *= j;
            }
            sum += giaiThua;
            System.out.println("Giai Thừa" + giaiThua);
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
        int xuLy = xuLy(arr, n);
        System.out.println(xuLy);
    }
}