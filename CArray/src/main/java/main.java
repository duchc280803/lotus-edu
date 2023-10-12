import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void phanTuLeChan() {
        int[] arr = {1, 3, 2, 44, 23};
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Số Chẵn" + " " + arr[i]);
            }
            if (arr[i] % 2 == 1) {
                System.out.println("Số lẻ" + " " + arr[i]);
            }
        }
    }

    public static void tongCacPhanTuLe() {
        int[] arr = {1, 3, 2, 44, 23};
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println("Tổng" + " " + sum);
    }

    public static void tongCacSoDuong() {
        int[] arr = {1, 3, 2, 44, 23};
        int n = 5;
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void tinhTiLeXuatHien() {
        int[] arr = {1, 3, 2, 44, 23};
        int n = 5;
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println("Tỉ Lệ là" + " " + sum * 100 / arr.length + "%");
    }

    public static void timSoChan() {
        int[] arr = {1, 3, 2, 44, 23};
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0 && i % 2 != 0) {
                System.out.println("Số Chẵn Ở Vị Trí Lẻ là:" + " " + arr[i]);
                break;
            }
        }
    }

    public static void tongMinMax() {
        double[] arr = {1, 3, 2, 44, 23};
        double n = arr.length;
        double min = arr[0];
        double max = arr[0];
        double sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        sum += Math.pow(min, 2) + Math.pow(max, 2);
        System.out.println(sum);
    }

    public static void soLanXuatHien() {
        int[] arr = {1, 3, 2, 44, 23, 3};
        int target = 3;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1); // nếu không nó sẽ trả về giá trị mặc định là 0
            // getOrDefault sử dụng để lấy giá trị được ánh xạ với khóa được chỉ định
            // + 1 tăng số lần xuất hiện của x lên một đơn vị
        }
        if (map.containsKey(target)) {
            //containsKey() được sử dụng để kiểm tra xem một khóa cụ thể có được ánh xạ vào HashMap hay không
            System.out.println("Số " + target + " xuất hiện " + map.get(target) + " lần trong mảng.");
        } else {
            System.out.println("Số " + target + " không xuất hiện trong mảng.");
        }
    }

    public static void soLanKiTuXuatHien() {
        char arr[] = {'n', 'm', 'n', 'e'};
        char target = 'n';
        int dem = 0;
        for (char x : arr) {
            if (x == target) {
                dem++;
            }
        }
        System.out.println(dem);
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void bubbleSort() {
        int[] arr = {6, 2, 5, 1, 4, 3};
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void tinhChatMang() {
        int[] arr = {1, 3, 2, 44, 23, 3};
        int n = arr.length;
        int demTang = 0;
        int demGiam = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                demTang++;
            } else if (arr[i] > arr[i + 1]) {
                demGiam++;
            }
        }
        if (demTang == n - 1) {
            System.out.println("Tăng");
        } else if (demGiam == n - 1) {
            System.out.println("Giảm");
        } else {
            System.out.println("Hỗn Độn");
        }
    }

    public static void doiSo() {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int n = arr.length;
        int doiSo = 0;
        for (int i = 0; i <= n - 1; i++) {
            doiSo = arr[i] * (-1);
            System.out.println(doiSo);
        }
    }

    public static void daoNguocMangKyTu() {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void nhapPhanTu(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void trungBinhCong() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int sum = 0;
        int tbc = 0;
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 == 0 && i % 2 != 0) {
                System.out.println("số chắn là " + arr[i] + " " + "ở vị trí lẻ là: " + i);
                sum += arr[i];
                dem++;
            }
        }
        tbc += sum / dem;
        System.out.println("Trung Bình Cộng" + " " + tbc);
    }

    public static void nhapPhanTuBanPhim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        if (n > 100) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Các Phần Tử Trong Mảng Là" + " " + arr[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Các Phần Tử Ngược Trong Mảng là:" + " " + arr[i]);
        }
    }

    public static void sọChinhPhuong() {
        int[] arr = {1, 3, 4, 9, 6, 16};
        int n = arr.length;
        double can = 0;
        for (int i = 0; i < n; i++) {
            can = Math.sqrt(arr[i]);
            if (can * can == arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int findArray(int viTriCanTim) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == viTriCanTim) {
                return i;
            }
        }
        return -1;
    }

    public static void phanTuThoaMan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        if (n < 0 && n > 3) {
            System.out.println("Yêu cầu nhập lại");
            System.out.println("Mời Nhập lại");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] * arr[i + 1] == arr[i]) {
                System.out.println(i - 1 + i + 1 + i);
            } else {
                System.out.println(-1);
            }
        }
    }

    public static void sọChinhPhuongFirstTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy Nhập Số Lượng Phần Tử");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Khong co so chinh phuong nao trong mang");
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ" + " " + i);
            arr[i] = scanner.nextInt();
        }
        double can = 0;
        for (int i = 0; i < n; i++) {
            can = Math.sqrt(arr[i]);
            if (can * can == arr[i]) {
                System.out.println("So chinh phuong dau tien trong mang la:" + " " + arr[i] + " " + "nam o vi tri so " + " " + i + " " + "Trong Mảng");
            } else {
                System.out.println("Khong co so chinh phuong nao trong mang");
            }
        }
    }

    public static void soHoanHao() {
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
        int tong = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int sum = 0;
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            if (sum == num) {
                System.out.println(num + " Là Số Chính Phương.");
                tong += num;
            }
        }
        System.out.println("Tổng" + tong);
    }

    public static void kiemTraCuoiMon() {
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
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Phần Tử Lẻ Là " + arr[i]);
                for (int j = 2; j <= arr[i] / 2; j++) {
                    System.out.println("Số Nguyên Tố Là" + arr[i]);
                    if (j % 2 == 0) {
                        System.out.println("Tích các nguyên tố tại vị trí chẵn" + arr[j] * arr[j + 1]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        nhapPhanTu(arr, n);
        soLanXuatHien();
    }
}
