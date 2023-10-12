package org.example;

import java.util.*;

public class BaiTapCollections {

    public static void tinhDoDaiChuoi() {
        String[] arr = {"abc", "abcd", "abcde", "abcdef"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length());
        }
    }

    public static void tongMangSoNguyen() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void timViTriDauTien() {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        int kq = Arrays.binarySearch(arr, 1); //  tìm giá trị được chỉ định trong mảng
        System.out.println(kq);
    }

    public static void inMangHaiChieu() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void inSoChanSoLe() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Các Phần Tử Ở Vị Trí Chẵn Là" + " " + arr[i]);
            } else {
                System.out.println("Các Phần Tử Ở Vị Trí Lẻ Là" + " " + arr[i]);
            }
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void sapXepNoiBot() {
        int[] arr = {6, 2, 5, 1, 4, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void tinhTiLeXuatHien() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int dem = 0;
        int phanTram = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                dem++;
            }
        }
        phanTram *= dem;
        int tiLe = phanTram / arr.length;
        System.out.println(tiLe);
    }

    public void nhapXuat() {
        List<Integer> soNguyen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int SoNguyen = scanner.nextInt();
        soNguyen.add(SoNguyen);
        for (Integer x : soNguyen) {
            System.out.println(x);
        }
    }

    public static void tongBinhPhuong() {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        sum = min + max;
        System.out.println(sum);
    }

    public static void sapXepChuoi() {
        List<String> listChuoi = new ArrayList<>();
        listChuoi.add("Cam");
        listChuoi.add("Dua");
        listChuoi.add("Dua");
        listChuoi.add("Le");
        listChuoi.add("Mit");
        listChuoi.add("Oi");
        listChuoi.add("Quyt");
        listChuoi.add("Tao");
        Collections.sort(listChuoi);
        for (int i = 0; i < listChuoi.size(); i++) {
            System.out.println(i + listChuoi.get(i));
        }
    }

    public static void xoaBo() {
        Map<Integer, String> integerMap = new HashMap<>();
        integerMap.put(1, "Red");
        integerMap.put(2, "Blue");
        integerMap.remove(1);
    }

    public static void inPhanTuList() {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        for (Integer x : listInteger) {
            System.out.println(x);
        }
    }

    public static void thayThe() {
        List<String> listChuoi = new ArrayList<>();
        listChuoi.add("one Two three Four five six one three Four");
        listChuoi.set(0, "ten three Four five six ten three Four");
    }

    public static void xoaPhanTu() {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.remove(2);
        for (Integer x : listInteger) {
            System.out.println(x);
        }
    }

    public static void timKiem() {
        List<String> listChuoi = new ArrayList<>();
        listChuoi.add("Cam");
        listChuoi.add("Dua");
        listChuoi.add("Dua");
        listChuoi.add("Le");
        listChuoi.add("Mit");
        listChuoi.add("Oi");
        listChuoi.add("Quyt");
        listChuoi.add("Tao");
        int cuoi = listChuoi.lastIndexOf("Tao");
        int dau = listChuoi.indexOf("Cam");
        System.out.println(cuoi);
        System.out.println(dau);
    }

    public static void xoaPhanTuSet() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Toán");
        stringSet.add("Lý");
        stringSet.add("Hóa");
        stringSet.add("Văn");
        stringSet.add("Anh");
        stringSet.add("Toán Cao Cấp");
        stringSet.add("Sinh hoa");
        stringSet.remove("Văn");
        for (String x : stringSet) {
            System.out.println(x);
        }
    }

    public static void xoaChon() {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(4);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(6);
        listInteger.add(3);
        listInteger.add(2);
        listInteger.add(5);
        Collections.shuffle(listInteger); // Xáo chộn
        for (Integer x : listInteger) {
            System.out.println(x);
        }
    }

    public static void kickCoSet() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Toán");
        stringSet.add("Toán");
        stringSet.add("Toán");
        stringSet.add("Toán");
        stringSet.add("Toán");
        stringSet.add("Toán");
        for (String x : stringSet) {
            System.out.println(x);
        }
    }

    public static void kiemTra() {
        Map<Integer, String> integerMap = new HashMap<>();
        integerMap.put(1, "Red");
        integerMap.put(2, "Blue");
        if (integerMap.containsKey(4)) {
            System.out.println("Chứa");
        } else {
            System.out.println("Không chứa");
        }
    }

    public static void bienDoi() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Toán");
        arrayList.add("Lý");
        arrayList.add("Hóa");
        arrayList.add("Văn");
        arrayList.add("Anh");
        arrayList.add("Toán Cao Cấp");
        arrayList.add("Sinh hoa");
        arrayList.remove("Văn");
        Object[] object = arrayList.toArray();
        for (Object c : object) {
            System.out.println(c);
        }
    }

    public static void kiemTraSet() {
        Set<String> listChuoi = new HashSet<>();
        listChuoi.add("Cam");
        listChuoi.add("Dua");
        listChuoi.add("Dua");
        listChuoi.add("Le");
        listChuoi.add("Mit");
        listChuoi.add("Oi");
        listChuoi.add("Quyt");
        listChuoi.add("Tao");
        if (listChuoi.isEmpty()) {
            System.out.println("Sét Rỗng");
        } else {
            System.out.println("Sét Có Phần Tử");
        }
    }

    public static void kiemTraChuoiSet() {
        Set<String> listChuoi = new HashSet<>();
        listChuoi.add("Cam");
        listChuoi.add("Dua");
        listChuoi.add("Dua");
        listChuoi.add("Le");
        listChuoi.add("Mit");
        listChuoi.add("Oi");
        listChuoi.add("Quyt");
        listChuoi.add("Tao");
        if (listChuoi.contains("Hvit")) {
            System.out.println("Sét Không Chứa");
        } else {
            System.out.println("Sét Chứa");
        }
    }

    public static void duyetHashMap() {
        Map<String, String> listChuoi = new HashMap<>();
        listChuoi.put("Việt Nam", "Hà Nội");
        listChuoi.put("Hoa Ky", "Washington, D.C");
        listChuoi.put("Han Quoc", "Seoul");
        for (String x : listChuoi.keySet()) {
            System.out.println(x);
        }

        for (String x : listChuoi.values()) {
            System.out.println(x);
        }
    }

    public static void themPhanTuVaoMap() {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Blue");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Black");
        map2.put(6, "Orange");
        map1.putAll(map2);
        for (String x : map1.values()) {
            System.out.println(x);
        }
    }

    public static void timMinMax() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list.stream().min(Integer::compare).get());
        System.out.println(list.stream().max(Integer::compare).get());
    }

    public static void xoaPhanTuTrongSet() {
        Set<Integer> setA = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        Set<Integer> setB = new HashSet<>(Arrays.asList(new Integer[]{4, 5, 6, 7, 8}));
        setA.add(9);
        setB.add(10);
        System.out.println("Set A trước khi xóa: " + setA);
        System.out.println("Set B trước khi xóa: " + setB);
        setA.remove(3);
        setB.removeAll(setA);
        setA.clear();
        setB.clear();
        System.out.println("Set A sau khi xóa: " + setA);
        System.out.println("Set B sau khi xóa: " + setB);
    }

    public static void daoNguoiList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(5);
        Collections.reverse(list); // đảo ngược
    }

    public static void duyetDanhSachIte() {
        List<String> list = new ArrayList<>();
        list.add("Cam");
        list.add("Dua");
        list.add("Dua");
        list.add("Le");
        list.add("Mit");
        list.add("Oi");
        list.add("Quyt");
        list.add("Tao");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }

    public static void tapHopGiao() {
        Set<Integer> setA = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        Set<Integer> setB = new HashSet<>(Arrays.asList(new Integer[]{4, 5, 6, 7, 8}));
        setA.retainAll(setB); // tìm giá trị trùng lặp
        System.out.println(setA);
    }

    public static void duyetNguocIte() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(5);
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public static void chiaMangChanLe() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] soLe = new int[n];
        int[] soChan = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int le = 0;
        int chan = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                soLe[le++] = arr[i];
            }
            if (arr[i] % 2 == 0) {
                soChan[chan++] = arr[i];
            }
        }
        for (int i = 0; i < chan; i++) {
            System.out.println(soChan[i]);
        }
        for (int i = 0; i < le; i++) {
            System.out.println(soLe[i]);
        }
    }

    public static boolean kiemTraSoTang() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 9) {
            return false;
        }
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            int bienOne = Character.getNumericValue(str.charAt(i));
            int bienTwo = Character.getNumericValue(str.charAt(i + 1));
            if (bienOne < bienTwo) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void soDauTienChiaHetCho10() {
        int[] arr = {1, 22, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void tinhChatMang() {
        int[] arr = {1, 22, 3, 4, 5, 6, 7, 8, 9, 10};
        int demGiam = 0;
        int demTang = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                demGiam++;
            } else if (arr[i] < arr[i + 1]) {
                demTang++;
            }
        }
        if (demTang == arr.length - 1) {
            System.out.println("Dãy Tăng");
        } else if (demGiam == arr.length - 1) {
            System.out.println("Đếm Giảm");
        } else {
            System.out.println("Hỗn Độn");
        }
    }

    public static boolean isCheck(int number) {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static int mangChan() {
        int[] arr = {123, 246, 345, 468, 456, 567};
        for (int i = 0; i < arr.length - 1; i++) {
            if (isCheck(arr[i])) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void inSoChan(int[] arr) {
        for (int num : arr) {
            boolean allEven = true;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 != 0) {
                    allEven = false;
                    break;
                }
                temp /= 10;
            }
            if (allEven) {
                System.out.println(num);
            }
        }
    }

    public static void daoNguocMang() {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void ktMangDoiXung() {
        int[] arr = {1, 2, 3, 3, 1};
        int n = arr.length;
        int kt = 1;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                kt = 0;
                break;
            }
        }
        if (kt == 0) {
            System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
        } else {
            System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
        }
    }

    public static boolean nguyenTo(int number) {
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

    public static void baiTapTongHop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số Lượng Phần Tử: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời Nhập Phần Tử Thứ " + i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Mảng Vừa Nhập Là: " + arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                if (nguyenTo(arr[i])) {
                    System.out.println("Số nguyên tố trong phần tử lẻ" + " " + arr[i]);
                }
            }
        }

        int tich = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (nguyenTo(arr[i])) {
                    tich *= arr[i];
                }
            }
        }
        System.out.println("Tích các số nguyên tố là : " + " " + tich);
    }

    public static void chuanHoa() {
        String str = "   NgUyen VaN   An    ";
        str = str.trim();
        String[] tuArr = str.split("\\s+");
        String ho = tuArr[0].substring(0, 1).toUpperCase() + tuArr[0].substring(1).toLowerCase();
        String ten = "";
        for (int i = 1; i < tuArr.length; i++) {
            ten += tuArr[i].substring(0, 1).toUpperCase() + tuArr[i].substring(1).toLowerCase();
        }
        String email = ten + ho.charAt(0) + ho.charAt(1) + "@hvitclan.vn";
        System.out.println(email);
    }

    public static void main(String[] args) {
        tapHopGiao();
    }
}
