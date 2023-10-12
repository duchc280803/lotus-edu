package org.example;

import java.util.Scanner;

public class MangHaiChieu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập Giá Trị Ở" + " " + i + "ví trí" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
