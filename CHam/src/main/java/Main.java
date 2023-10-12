import java.util.Scanner;

public class Main {

    public static int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static double toanCoBan(double a, double b) {
        return a * b;
    }

    public static void nhapXuatCoBan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Mảng Vừa Nhập Là " + arr[i]);
        }
    }

    public static String kiemTra(int n) {
        int can = n / 2;
        int chinhPhuong = can * can;
        if (chinhPhuong == n) {
            return "Đây là Số Chính Phương";
        }
        return "Đây Không Là Số Chính Phương";
    }

    public static void viTriPhanTuTrongMang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        int target = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                System.out.println("Phần tử" + " " + target + " " + "Xuất Hiện Tại Vị Trí" + " " + i);
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void sapXepMang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Mảng Sau Khi Sắp Xếp Là " + arr[i]);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void hienThiCacSoNguyenToTrongmang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("Các số nguyên tố trong mảng là" + arr[i]);
            }
        }
    }

    public static void inBangCuuChuong() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void nguyenMauHam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                System.out.println("Giá Trị Nhỏ Nhất Là" + arr[i]);
            }
            if (arr[i] > max) {
                System.out.println("Giá Trị Lớn Nhất Là" + arr[i]);
            }
            if (arr[i] % 2 == 0) {
                System.out.println("đây là số chẵn" + arr[i]);
            }

            if (arr[i] % 2 != 0) {
                System.out.println("đây là số lẻ" + arr[i]);
            }
        }
    }

    public static void nguyenMauHam28() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                System.out.println("Giá Trị Nhỏ Nhất Là" + arr[i]);
            }
            if (arr[i] > max) {
                System.out.println("Giá Trị Lớn Nhất Là" + arr[i]);
            }
            if (arr[i] % 2 == 0) {
                System.out.println("đây là số chẵn" + arr[i]);
            }

            if (arr[i] % 2 != 0) {
                System.out.println("đây là số lẻ" + arr[i]);
            }
        }
    }

//    public char[] timChuoi(char[] chuoi, int n) {
//    }
//
//    public boolean kiemTraChuoi(int x, int a[], int n) {
//
//    }
//
//    double timTong(int n, double a[]) {
//
//    }
//
//    double tinhTrungBinhCong(int a[][], int n) {
//
//    }

//    void nhapMang(int a[][], int n, int m) {
//
//    }
//
//    void tinhTong(int n, int a, int b) {
//
//    }
//
//    boolean kiemTra(int n) {
//
//    }
//
//    void soThuc(int a, int b) {
//
//    }
//
//    void soChinhPhuong(int n) {
//
//    }

//    public int dienTichHinhChuNhat(int a, int b) {
//
//    }
//
//    public void findMinMax(int n, int min, int max) {
//
//    }
//
//    public void findMin(int n, int min) {
//
//    }
//
//    public void inMang(int n, int[] arr) {
//
//    }
//
//    public void kiemTraChanLe(int n, int[] arr) {
//
//    }
//
//    public char timChuoiNganNhat(char[] chuoi, int n) {
//
//    }
//
//    public char timChuoi(char[] chuoi, int n) {
//
//    }
//
//    public int timGiaTriNhoNhat(int[] arr, int n, int sort) {
//
//    }
//
//    public boolean kiemTra(int n) {
//
//    }

//    public void hienThi(int[] arr,int n) {
//
//    }
//
//    public char thayDoiChuCaiDau(char[] arr,int n) {
//
//    }
//
//    public int thayDoiChuCaiDau(int n) {
//
//    }
//
//    public char demSoNguyen(char[] arr,int n) {
//
//    }
//
//    public void demSo(int[] arr,int n) {
//
//    }

//    public void ptBacHai(int a, int b, int c) {
//
//    }
//
//    public void mangHaiChieu(int a[][]) {
//
//    }
//
//    public int tonMang(int a[], int n) {
//
//    }
//
//    public boolean kiemTraSoNguyen(int n) {
//
//    }
//
//    public void hoanVi(int a, int b) {
//
//    }

//    public void soLapPhuong(int a) {
//
//    }
//
//    public void kiemTraBaSo(int a, int b, int c) {
//
//    }
//
//    public int timPhanTu(int a[], int n) {
//
//    }
//
//    public int danhSachSoNguyenChia(int a[], int n) {
//
//    }
//
//    public int uocChungLonNhat(int a, int b, int c) {
//
//    }

    public static void main(String[] args) {
        int a = uocChungLonNhat(48, 18);
        System.out.println(a);
    }
}
