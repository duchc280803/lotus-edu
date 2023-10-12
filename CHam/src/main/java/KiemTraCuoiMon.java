import java.util.Scanner;

public class KiemTraCuoiMon {

    public static void bai1() {
        int a = 10;
        double b = 100.5E+2;
        char c = 'x';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void bai2() {
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
            System.out.println("Các Phần Tử Trong Mảng Là:" + arr[i]);
            if (arr[i] % 2 == 0) {
                System.out.println("Các Phần Tử chẵn Trong Mảng Là:" + arr[i]);
            }

            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println("Các Phần Tử Chia Hết Cho 3 và 5 Trong Mảng Là:" + arr[i]);
            }
        }
    }

    public void inMangSoThuc(int[] arr, int n) {

    }

    public void canBacX(int n) {

    }

    public void hoanDoi(int x, int y) {

    }

    public void tongNguyen(int[] arr, int n, int[] brr, int m) {

    }

    public void canBacHai(int n) {

    }

    public void kiemTraSo(int n) {

    }

    public void timSoBeNhat(int[] arr, int n, int min) {

    }

    public void timX(int[] arr, int n, int x) {

    }

    public static boolean soDoiXung(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int first = num % 10;
            reversed = reversed * 10 + first;
            num /= 10;
        }
        return original == reversed;
    }

    public static int sumDoiXung(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (soDoiXung(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
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

        System.out.println("Mời Nhập Target");
        int target = scanner.nextInt();
        boolean isTargetSymmetric = soDoiXung(target);
        int sumSymmetric = sumDoiXung(arr);

        System.out.println("Có số đối xứng " + (isTargetSymmetric ? "có" : "không có") + " trong mảng.");
        System.out.println("Tổng các số đối xứng trong mảng: " + sumSymmetric);
    }
}
