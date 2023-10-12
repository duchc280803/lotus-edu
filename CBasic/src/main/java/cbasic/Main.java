package cbasic;

import java.util.Scanner;

public class Main {
    public static double toanCoBan1() {
        double a = 8;
        double b = 9;
        double thuong = a / b;
        double canBacHai = Math.sqrt(thuong);
        return canBacHai;
    }

    public static void toanCoBan2() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double sum = a + b;
        double tru = a - b;
        double nhan = a * b;
        double thuong = a / b;
        double soDu = a % b;
        System.out.println(sum);
        System.out.println(tru);
        System.out.println(nhan);
        System.out.println(thuong);
        System.out.println(soDu);
    }

    public static void kiemTraChanLe() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Đây Là Số Chẵn" + " " + a);
        } else {
            System.out.println("Đây Là Số Lẻ" + " " + a);
        }
    }

    public static void boiChungNhoNhat() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ucln = 0;
        int a1 = a;
        int b1 = b;
        if (a == b) {
            ucln = a;
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        }
    }

    public static void hoanDoiGiaTri() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        a = b;
        b = c;
        c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void hamSwitch() {
        Scanner scanner = new Scanner(System.in);
        int thu = scanner.nextInt();
        switch (thu) {
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            case 8:
                System.out.println("Thứ 8");
                break;
            default:
                System.out.println("Không Phải Là Thứ trong tuần");
                break;
        }
    }

    public static void timQuy() {
        Scanner scanner = new Scanner(System.in);
        int thang = scanner.nextInt();
        switch (thang) {
            case 1:
                System.out.println("Quý 1");
                break;
            case 2:
                System.out.println("Quý 1");
                break;
            case 3:
                System.out.println("Quý 1");
                break;
            case 4:
                System.out.println("Quý 2");
                break;
            case 5:
                System.out.println("Quý 2");
                break;
            case 6:
                System.out.println("Quý 2");
                break;
            case 7:
                System.out.println("Quý 3");
                break;
            case 8:
                System.out.println("Quý 3");
                break;
            case 9:
                System.out.println("Quý 3");
                break;
            case 10:
                System.out.println("Quý 4");
                break;
            case 11:
                System.out.println("Quý 4");
                break;
            case 12:
                System.out.println("Quý 4");
                break;
            default:
                System.out.println("Không hợp Lệ");
                break;
        }
    }

    public static void timNghiem() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double fx = 0;
        if (x >= 5) {
            fx = 2 * Math.pow(x, 2) + 5 * x + 9;
            System.out.println(fx);
        } else {
            fx = -2 * Math.pow(x, 2) + 4 * x - 9;
            System.out.println(fx);
        }
    }

    public static void namNhuan() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 1000 && a < 2020) {
            if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
                System.out.println("Đây Là Năm Nhuận");
            } else {
                System.out.println("Đây Không Là Năm Nhuận");
            }
        } else {
            System.out.println("Không Tính Đươc");
        }

    }

    public static void toanTuCoBan() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(--a);
        System.out.println(a -= b);
        System.out.println(b += a);
    }

    public static void phuongTrinhBacHai() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double detail = Math.pow(b, 2) - 4 * a * c;
        if (detail < 0) {
            System.out.println("Phương Trình Vô Nghiệm");
        }
        if (detail == 0) {
            double x = -b / 2 * a;
            System.out.println("Phương Trình Có Nghiệm Kép là:" + x);
        }
        if (detail > 0) {
            double x1 = -b + Math.sqrt(a) / 2 * a;
            double x2 = -b - Math.sqrt(a) / 2 * a;
            System.out.println("Phương Trình Có 2 Nghiệm Phân Biệt Là:" + x1 + " " + x2);
        }
    }

    public static void canhTamGiac() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b || b == c || a == c) {
            System.out.println("Đây Là Tam Giác Cân");
        } else if (a == b && b == c) {
            System.out.println("Đây Là Tam Đều");
        } else if (a * b == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
            System.out.println("Đây Là Tam Vuông");
        } else {
            System.out.println("Đây Là Tam Thường");
        }
    }

    public static void tinhToan() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double giaTri = Math.sin(Math.abs(Math.pow(a, (b - c))));
        System.out.println(giaTri);
    }

    public static void switch2() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Quý 1");
                break;
        }
    }

    public static void tienDienThoai() {
        Scanner scanner = new Scanner(System.in);
        int soPhutGoi = scanner.nextInt();
        if (soPhutGoi <= 50) {
            double phiGoiDau = 600 * 0.1 + 25000;
            System.out.println(phiGoiDau);
        } else if (soPhutGoi > 50 && soPhutGoi <= 150) {
            double phiTiepTheo = 400 * 0.1 + 25000;
            System.out.println(phiTiepTheo);
        } else {
            double phiTiepTheo1 = 200 * 0.1 + 25000;
            System.out.println(phiTiepTheo1);
        }
    }

    public static void toanTuBaNgoi() {
        Scanner scanner = new Scanner(System.in);
        int doanhThu = scanner.nextInt();
        double discount = doanhThu <= 100 ? doanhThu * 0.5 : doanhThu <= 300 ? doanhThu * 0.1 : doanhThu * 0.2;
    }

    public static boolean soNguyenTo(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void inSo(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void inSoChan(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void veDuong(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("*");
        }
    }

    public static void chiaHetChoA(int number, int a) {
        for (int i = 1; i <= number; i++) {
            if (i % a == 0) {
                System.out.println(i);
            }
        }
    }

    public static void veHinhChuNhat() {
        int chieuRong = 5;
        int chieuDai = chieuRong * 2;
        for (int i = 1; i <= chieuRong; i++) {
            for (int j = 1; j <= chieuDai; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static String chuyenSangChu(int number) {
        if (number < 0 && number > 999) {
            return "Nằm Ngoài Phạm Vi";
        }
        String[] donVi = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String[] chuc = {"Mười", "Mười Một", "Mười Hai", "Mười Ba", "Mười Bốn", "Mười Năm", "Mười Sáu",
                "Mười Bảy", "Mười Tám", "Mười Chín"};
        String[] tram = {"Một Trăm", "Hai Trăm", "Ba Trăm", "Bốn Trăm", "Năm Trăm", "Sáu Trăm",
                "Bảy Trăm", "Tám Trăm", "Chín Trăm"};


        int hangTram = number / 100;
        int hangChuc = number % 10;
        int hangDonVi = number % 10;

        String result = "";
        if (number > 99 && number < 1000) {
            switch (hangTram) {
                case 0:
                    break;
                default:
                    result += tram[hangTram] + " " + donVi[hangTram] + "Mươi" + donVi[hangTram];
            }

        }

        if (number > 10 && number < 100) {
            switch (hangChuc) {
                case 0:
                    break;
                default:
                    result += chuc[hangChuc] + " ";
            }
        }

        if (number < 10 && number > 0) {
            switch (hangDonVi) {
                case 0:
                    break;
                default:
                    result += donVi[hangDonVi] + " ";
            }
        }

        return result;
    }

    public static int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void demChuSo(int a) {
        int dem = 0;
        while (a > 0) {
            a /= 10;
            dem++;
        }
        System.out.println(dem);
    }

    public static int boiChungNhoNhat(int a, int b) {
        int tich = a * b / uocChungLonNhat(a, b);
        return tich;
    }

    public static void timSoChanTrongKhoang(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ASCII(int a) {
        System.out.println((char) a);
    }

    public static void kiemTraCuoiMon(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println("số lẻ" + i);
                sum += i;
            }
        }
        System.out.println("Tổng" + sum);
        if (sum % 3 == 0) {
            System.out.println("Tổng Chia Hết Cho 3" + sum / 3);
        } else {
            sum -= 10;
            System.out.println("Tổng Không Chia Hết Cho 3" + sum);
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
        boolean a = soNguyenTo(17);
        System.out.println(a);
    }
}
