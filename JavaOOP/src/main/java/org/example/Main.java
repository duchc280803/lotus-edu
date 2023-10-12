package org.example;

import org.example.cuahangsach.TaiLieu;
import org.example.cuahangsach.TapChi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int inputInteger() {
        int input;
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (Exception ex) {
            ex.printStackTrace();
            return inputInteger();
        }
        return input;
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static double inputDouble() {
        double input;
        try {
            input = Double.parseDouble(scanner.nextLine());
        } catch (Exception ex) {
            ex.printStackTrace();
            return inputDouble();
        }
        return input;
    }

    public static void main(String[] args) {
        ThoiGian thoiGian = new ThoiGian(7, 9, 2023);
        thoiGian.layThongTin();
        ThoiGian thoiGian1 = new ThoiGian(10, 9, 2023);
        System.out.println(thoiGian.layKhoangThoiGian(thoiGian1));
    }
}