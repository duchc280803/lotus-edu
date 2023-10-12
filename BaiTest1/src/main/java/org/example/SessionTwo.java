package org.example;

public class SessionTwo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Các Phần Tử Trong Mảng Là: " + " " + arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Các phần tử chẵn là:" + " " + arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                System.out.println("Các phần tử chia hết cho 3 và 5 là " + " " + arr[i]);
            }
        }
    }
}
