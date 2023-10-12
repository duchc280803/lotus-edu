import java.util.*;

public class SinhVien {

    public int soThuTu;

    public String maSinhVien;

    public String hoVaTen;

    public double diemDaiSo;

    public double diemGiaiTich;

    private double diemTrungBinh;

    public List<SinhVien> listSv = new ArrayList<>();

    public SinhVien() {
    }

    public SinhVien(int soThuTu, String maSinhVien, String hoVaTen, double diemDaiSo, double diemGiaiTich) {
        this.soThuTu = soThuTu;
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemDaiSo = diemDaiSo;
        this.diemGiaiTich = diemGiaiTich;
        this.diemTrungBinh = (diemDaiSo + diemGiaiTich) * 2;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getDiemDaiSo() {
        return diemDaiSo;
    }

    public void setDiemDaiSo(double diemDaiSo) {
        this.diemDaiSo = diemDaiSo;
    }

    public double getDiemGiaiTich() {
        return diemGiaiTich;
    }

    public void setDiemGiaiTich(double diemGiaiTich) {
        this.diemGiaiTich = diemGiaiTich;
    }

    public String xepLoai(SinhVien sv) {
        if (sv.diemTrungBinh >= 9) {
            return "xuất sắc";
        } else if (sv.diemTrungBinh >= 8) {
            return "giỏi";
        } else if (sv.diemTrungBinh >= 7) {
            return "khá";
        } else if (sv.diemTrungBinh >= 5) {
            return "trung bình";
        } else {
            return "yếu";
        }
    }

    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Số Thứ Tự");
        soThuTu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời Nhập Mã Sinh Viên");
        maSinhVien = scanner.nextLine();
        System.out.println("Mời Nhập Họ Và Tên");
        hoVaTen = scanner.nextLine();
        System.out.println("Mời Nhập Điểm Đại Số");
        diemDaiSo = scanner.nextDouble();
        System.out.println("Mời Nhập Điểm Giải Tích");
        diemGiaiTich = scanner.nextDouble();
        listSv.add(new SinhVien(soThuTu, maSinhVien, hoVaTen, diemDaiSo, diemGiaiTich));
    }

    public void inDanhSach() {
        for (SinhVien sv : listSv) {
            System.out.println(sv.soThuTu);
            System.out.println(sv.maSinhVien);
            System.out.println(sv.hoVaTen);
            System.out.println(sv.diemDaiSo);
            System.out.println(sv.diemGiaiTich);
        }
    }

    public void sort() {
        Collections.sort(listSv, Comparator.comparingDouble(sv -> sv.diemTrungBinh));
    }

    public void menu() {
        do {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3:
                    sort();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
