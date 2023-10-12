package org.example;

import java.util.*;

public class Main {

    public static void danhSachSoNguyen() {
        List<Integer>[] list = new ArrayList[3];
        List<Integer> danhSachList1 = new ArrayList<>();
        danhSachList1.add(1);
        danhSachList1.add(2);
        danhSachList1.add(3);
        danhSachList1.add(4);
        danhSachList1.add(5);
        List<Integer> danhSachList2 = new ArrayList<>();
        danhSachList2.add(6);
        danhSachList2.add(7);
        danhSachList2.add(8);
        danhSachList2.add(9);
        danhSachList2.add(10);
        List<Integer> danhSachList3 = new ArrayList<>();
        danhSachList3.add(11);
        danhSachList3.add(12);
        danhSachList3.add(13);
        danhSachList3.add(14);
        danhSachList3.add(15);
        list[0] = danhSachList1;
        list[1] = danhSachList2;
        list[2] = danhSachList3;
        for (List<Integer> i : list) {
            System.out.println("Danh Sách Mảng" + " " + i);
        }
        Arrays.sort(list, Comparator.comparingDouble(Main::trungBinhCong).reversed());
        for (List<Integer> i : list) {
            System.out.println("Danh Sách Sau Sắp Xếp" + " " + i);
        }
    }

    public static double trungBinhCong(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public static void vietHoaDenN() {
        List<String> danhSachList = new ArrayList<>();
        danhSachList.add("Hoàng Công Đức");
        danhSachList.add("Nguyễn Hữu Nguyên");
        danhSachList.add("Lê Việt Hùng");
        danhSachList.add("Vũ Đình Minh");
        System.out.println("----------Danh Sách Ban Đầu----------");
        for (String chuoi : danhSachList) {
            System.out.println(chuoi);
        }
        System.out.println("----------Danh Sách In Hoa----------");

        for (String chuoi : danhSachList) {
            String inHoa = chuoi.substring(0, danhSachList.size()).toUpperCase() + chuoi.substring(danhSachList.size());
            System.out.println(inHoa);
            if (chuoi.length() < danhSachList.size()) {
                System.out.println(chuoi.toUpperCase());
            }
        }
        sapXepDanhSach(danhSachList);
        System.out.println("----------Danh Sách Sau Sắp Xếp----------");
        for (String chuoi : danhSachList) {
            System.out.println(chuoi.toUpperCase());
        }
        System.out.println("----------Sau Khi Thêm Dấu----------");
        inDanhSach(danhSachList);
    }


    public static void sapXepDanhSach(List<String> danhSach) {
        Collections.sort(danhSach, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }

    public static void inDanhSach(List<String> list) {
        for (String chuoi : list) {
            System.out.println(chuoi + ",");
        }
    }

    public static void main(String[] args) {
        danhSachSoNguyen();
    }
}