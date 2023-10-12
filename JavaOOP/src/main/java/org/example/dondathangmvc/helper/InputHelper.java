package org.example.dondathangmvc.helper;

import java.util.Scanner;

public class InputHelper {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    public static float readFloat() {
        return Float.parseFloat(scanner.nextLine());
    }

    public static String readString() {
        return scanner.nextLine();
    }
}