package org.example;

import java.time.LocalDate;

public class LearnString {

    public static void main(String[] args) {
        java.lang.String str = "hello world";
        char c = str.charAt(0); // trả về kí tự tại vị trí chỉ định
        str.substring(3); // cắt chuỗi từ vị trí thứ 3 đi
        str.substring(3, 4); // cắt chuỗi đầu là 3 cuối là 4
        boolean kt = str.contains(str); //  kiểm tra xem chuỗi có chứa ký tự khonog
        str.concat("alo"); // nối chuỗi
        str = str.replace("hello", "hi"); // thay thế các ký tự
        java.lang.String[] catChuoi = str.split(" "); // cắt opption chuyền vào
        java.lang.String regix = "^[0-9]+$";
        if (str.matches(regix)) {
            System.out.println("Đúng");
        }
        int index = str.indexOf("world"); // trả về vị trí ký tự có phân biệt hoa thường
        str.toLowerCase(); // trả về chuỗi hoa thường
        str.toUpperCase(); // trả về chuỗi in hoa
        LocalDate localDate = LocalDate.of(2003, 12, 3);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
    }
}
