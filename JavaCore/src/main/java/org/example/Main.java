package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public void nhapChuoi() {
        Scanner scanner = new Scanner(System.in);
        java.lang.String str = scanner.nextLine();
    }

    public void toanHoc() {
        double a = 5;
        double b = 9;
        double c = 10;
        System.out.println(Math.sin(a));
        System.out.println(Math.pow(b, 2));
        System.out.println(Math.sqrt(c));
        System.out.println(Math.abs(b));
    }

    public void giaTriHamSo() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (int) Math.pow(x, 2) + 3 * x + 2;
        System.out.println(y);
    }

    public void khaiBaoCoBan() {
        int a = 1;
        int b = 2;
        int c = 3;
        float d = 4;
        float e = 5;
        float f = 6;
        char g = 'đ';
        char h = 'd';
        char i = 'd';
        java.lang.String str1 = "sd";
        java.lang.String str2 = "sd";
        java.lang.String str3 = "sd";
    }

    public void chuyenKieu() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        char c = scanner.next().charAt(0);
        boolean d = scanner.hasNext();
        java.lang.String chuyenKieu = Integer.toString(a) + Double.toString(b) + Character.toString(c) + Boolean.toString(d);
    }

    public static void khoangCach() {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Khoảng cách từ điểm A" + "(" + x + " " + y + ")" + "Đến đường thẳng là"
                + Math.abs(a * x + b * y + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public void soChan() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Đây là số chẵn");
        }
    }

    public void soSach() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("a lớn hơn b");
        } else {
            System.out.println("a không lớn hơn b");
        }
    }

    public void hocLuc() {
        Scanner scanner = new Scanner(System.in);
        double toan = scanner.nextInt();
        double van = scanner.nextInt();
        double anh = scanner.nextInt();
        double sum = (toan + van + anh);
        double tb = sum / 3;
        if (tb < 4) {
            System.out.println("Học Lực yếu");
        } else if (tb > 4 && tb < 6.5) {
            System.out.println("Học Lực TB");
        } else if (tb > 6.5 && tb < 8) {
            System.out.println("Học lực khá");
        } else if (tb > 8 && tb < 9) {
            System.out.println("Học lực giỏi");
        } else {
            System.out.println("Học lực xuất xắc");
        }
    }

    public void soLonNhat() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("a là số lớn nhất");
        } else if (b > a && b > c) {
            System.out.println("b là số lớn nhất");
        } else {
            System.out.println("c là số lớn nhất");
        }
    }

    public void kiemTraTamGiac() {
        int a = 60;
        int b = 60;
        int c = 60;
        if (a == b && b == c) {
            System.out.println("Đây là một tam giác đều");
        } else if (a == b || b == c || a == c) {
            System.out.println("b là số lớn nhất");
        } else if (a == 90 || b == 90 || c == 90) {
            System.out.println("b là số lớn Vuông");
        } else {
            System.out.println("c là số lớn thường");
        }
    }

    public void kiemTraDuongThang() {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        if (a1 != 0 && a2 != 0) {
            double slopeDifference = Math.abs(a1 - a2);

            if (slopeDifference < 1e-6) {
                System.out.println("Hai Đường Thẳng Song Song");
            } else {
                double intersectionX = (b2 - b1) / (a1 - a2);
                double intersectionY = a1 * intersectionX + b1;

                if (Math.abs(a1 * a2 + 1) < 1e-6) {
                    System.out.println("Hai đường thẳng vuông góc");
                } else {
                    System.out.println("Hai đường cắt nhau tại điêm (" + intersectionX + ", " + intersectionY + ").");
                }
            }
        } else {
            System.out.println("Đầu vào không hợp lệ.");
        }
    }

    public void mua() {
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        switch (thang) {
            case 1:
            case 2:
            case 3:
                System.out.println("Mùa xuân");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Mùa Hạ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Mùa Thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Mùa Đông");
                break;
            default:
                System.out.println("Tháng không hợp lệ");
        }
    }

    public void kiemTraChieuCao() {
        Scanner scanner = new Scanner(System.in);
        double chieuCao = scanner.nextInt();
        if (chieuCao < 145) {
            System.out.println("Rất lùn");
        } else if (chieuCao < 150) {
            System.out.println("Lùn");
        } else if (chieuCao >= 150 && chieuCao <= 170) {
            System.out.println("Bình Thường");
        } else {
            System.out.println("Rất Cao");
        }
    }

    public void inSo() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 100) {
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("quá đà");
        }

    }

    public void timUoc() {
        int a = 50;
        int maxOddDivisor = 1;

        for (int i = 1; i <= a; i += 2) {
            if (a % i == 0) {
                maxOddDivisor = i;
            }
        }
        System.out.println("Ước số lẻ lớn nhất của " + a + " là " + maxOddDivisor);
    }

    public boolean soNguyenTo() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void tongSoNguyen() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += i;
        }
    }

    public void inChuoi() {
        java.lang.String str = "\"HeLLo, HaVe A GOOD dAy ! NiCE TO MEEt YoU\".";
        System.out.println("Chữ In Hoa" + str.toLowerCase());
        System.out.println("Chữ Thường" + str.toUpperCase());
        System.out.println("Độ Dài" + str.length());
    }

    public void timKiemChuoi() {
        java.lang.String str = "Hello Java, Hello HvitClan";
        str.lastIndexOf("HvitClan");
    }

    public void demKyTu() {
        java.lang.String str = "abracadabra";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                System.out.println("Ky tu a xuat hien " + i + "  lan trong chuoi");
            }
        }
    }

    public void ngayHienTai() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
    }

    public void dateTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy - HH:mm:ss");
        simpleDateFormat.format(calendar.getTime());
    }

    public void chuoi() {
        java.lang.String str1 = "Darling, just hold my hand";
        java.lang.String str2 = "hold";
        if (str1.contains(str2) == true) {
            System.out.println("Tim thay chuoi con trong chuoi ban dau da nhap");
        } else {
            System.out.println("Không tìm thất");
        }
    }

    public void vanToc() {
        Scanner scanner = new Scanner(System.in);
        double gio, phut, giay, thoiGian;
        double quangDuong;
        double vt1, vt2, vt3;
        System.out.println("Nhập Quãng Đường");
        gio = scanner.nextDouble();
        System.out.println("Nhập Giờ");
        gio = scanner.nextDouble();
        System.out.println("Nhập Phút");
        phut = scanner.nextDouble();
        System.out.println("Nhập giây");
        giay = scanner.nextDouble();
    }

    public void kiemTraMonthYear() {
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        int nam = scanner.nextInt();
        if (nam >= 1000 && nam <= 2023) {
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng" + " " + thang + " " + "- Năm" + " " + nam + " " + "Có 31 Ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng" + " " + thang + " " + "- Năm" + " " + nam + " " + "Có 30 Ngày");
                    break;
                case 2:
                    if (nam % 4 == 0 && nam % 100 != 0 && nam % 400 == 0) {
                        System.out.println("Tháng" + " " + thang + " " + "- Năm" + " " + nam + " " + "Có 29 Ngày");
                        break;
                    } else {
                        System.out.println("Tháng" + " " + thang + " " + "- Năm" + " " + nam + " " + "Có 28 Ngày");
                        break;
                    }
            }
        }
    }

    public void thayTheChuoi() {
        java.lang.String str = "Hello Java, Hello HVITCLAN";
        str.replace("Hello Java, Hello HVITCLAN", "Cheers Java, Cheers HVITCLAN");
    }

    public void demSoChuCai() {
        java.lang.String str = "Hello Java, Hello HVITCLAN 1";
        int demChuCai = 0;
        int demSo = 0;
        int demKyTu = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                demSo++;
            }
            if (Character.isLetter(str.charAt(i))) {
                demChuCai++;
            } else {
                demKyTu++;
            }
        }
    }

    public boolean kiemTraTK() {
        Scanner scanner = new Scanner(System.in);
        java.lang.String nhapAcc = scanner.nextLine();
        java.lang.String nhapPass = scanner.nextLine();
        java.lang.String acc = "nguyendongkhanh@hvitclan.vn";
        java.lang.String pass = "123456";

        if (nhapAcc.equalsIgnoreCase(acc) && nhapPass.equalsIgnoreCase(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public static void phanBiet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đoạn văn:");
        java.lang.String input = scanner.nextLine();
        int demChuT = 0;
        int demChuS = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 't' || input.charAt(i) == 'T') {
                demChuT++;
            }
            if (input.charAt(i) == 's' || input.charAt(i) == 'S') {
                demChuS++;
            }
        }
        if (demChuT > demChuS) {
            System.out.println("A-M");
        } else {
            System.out.println("A-A");
        }
    }

    public String chuanHoaEmail(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        StringBuilder email = new StringBuilder();

        for (int i = 0; i < nameParts.length; i++) {
            String namePart = nameParts[i];
            if (!namePart.isEmpty()) {
                if (i == nameParts.length - 1) {
                    email.append(namePart.toLowerCase());
                } else {
                    email.append(namePart.toLowerCase().charAt(0));
                }
            }
        }
        email.append("@hvitclan.vn");
        return email.toString();
    }

    public static void ngayNghiHuu() {
        String hoTen = "Nguyễn Văn A";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // định dạng ngày tháng năm
        try {
            Date ngaySinh = simpleDateFormat.parse("05/01/1980"); // tạo ra một ngày
            Calendar calNgaySinh = Calendar.getInstance(); // trả về thời gian hiện tại
            calNgaySinh.setTime(ngaySinh); // đặt tg cho lịch ngày đã cho
            Calendar calNgayVeHuu = (Calendar) calNgaySinh.clone(); // tạo và trả về bản sao đối tượng này
            calNgayVeHuu.add(Calendar.YEAR, 60); // cộng trừ thời gian

            System.out.println("Thông tin của " + hoTen);
            System.out.println("Ngày sinh: " + simpleDateFormat.format(ngaySinh));
            System.out.println("Ngày về hưu: " + simpleDateFormat.format(calNgayVeHuu.getTime()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void daoNguocChuoi() {
        String str = "Hello HvitClan";
        StringBuilder st = new StringBuilder(str);
        st.reverse(); // được sử dụng để đảo ngược chuỗi.
        if (st.compareTo(new StringBuilder(st.toString())) == 0) {
            System.out.println(st);
        } else {
            st.append(str); //để nối thêm các chuỗi được chỉ định với chuỗi này
            System.out.println(st);
        }
    }

    public static void thoiGianHienTai() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        System.out.println("Giờ Hiện Tại" + " " + calendar.get(Calendar.HOUR_OF_DAY) + "H"
                + " " + calendar.get(Calendar.MINUTE) + "P"
                + " " + calendar.get(Calendar.SECOND) + "S");
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String time = format.format(now);
        System.out.println(time);
    }

    public static void tich(int number) {
        String str = Integer.toString(number);
        int tich = 1;
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i)); // sử dụng để lấy giá trị số nguyên mà ký tự Unicode được chỉ định
            tich *= digit;
        }
        System.out.println(tich);
    }

    public static boolean kiemTraSoGiamDan(int number) {
        String str = Integer.toString(number);
        for (int i = 1; i < str.length(); i++) {
            int digit1 = Character.getNumericValue(str.charAt(i));
            int digit2 = Character.getNumericValue(str.charAt(i - 1));
            if (digit1 >= digit2) {
                return false;
            }
        }
        return true;
    }

    public static void soNguyen() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            number = Integer.parseInt(scanner.nextLine());
            if (number >= 1 && number <= 100) {
                System.out.println(number);
            } else {
                System.out.println("Mời Nhập Lại");
            }
        }
    }

    public static boolean kiemTra(int number) {
        int temp;
        do {
            temp = number % 10;
            number /= 10;
            if (temp % 2 == 0) {
                return false;
            }
        } while (number > 0);
        return true;
    }

    public static double tinhTongTheoChuoi(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * (i + 1));
        }
        return sum;
    }

    public static int uocChung(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static int boiChung(int a, int b) {
        return (a * b) / uocChung(a, b);
    }

    public static void soToanLe(int number) {
        if (kiemTra(number)) {
            System.out.println("Đây Là Số Toàn Lẻ");
        } else {
            System.out.println("Đây Không Là Số Toàn Lẻ ");
        }
    }

    public static void tachTich() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        } while (n <= 0);
        for (int i = 2; i <= n; i++) {
            while (isCheck(i) && n % i == 0) {
                System.out.println(i + " ");
                n /= i;
            }
        }
    }

    public static boolean isCheck(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void xoaChuoi() {
        String str = "Hello Java ,Hello HvitClan";
        str.substring(3, 4);
    }

    public static void main(String[] args) {
        System.out.println(kiemTraSoGiamDan(10));
    }
}