import java.util.*;

public class NhanVien {

    public String maNhanVien;

    public String tenNhanVien;

    public String chucVu;

    public int soNgayCong;

    public double tienLuong;

    public String xepLoai;

    public double thuongOrPhat;

    public List<NhanVien> listNv = new ArrayList<>();

    public NhanVien(String maNhanVien, String tenNhanVien, String chucVu, int soNgayCong, double tienLuong) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
        this.tienLuong = tienLuong;
        if (soNgayCong == 27) {
            this.xepLoai = "Xuất Sắc";
        } else if (soNgayCong == 25 || soNgayCong == 26) {
            this.xepLoai = "Giỏi";
        } else if (soNgayCong == 22 || soNgayCong == 23 || soNgayCong == 24) {
            this.xepLoai = "Khá";
        } else if (soNgayCong == 15 || soNgayCong == 16 || soNgayCong == 17 || soNgayCong == 18 || soNgayCong == 19 || soNgayCong == 20 || soNgayCong == 21) {
            this.xepLoai = "Trung Bình";
        } else {
            this.xepLoai = "Yếu";
        }
        if (this.xepLoai == "Xuất Sắc") {
            this.thuongOrPhat = tienLuong * 0.2;
        } else if (this.xepLoai == "Giỏi") {
            this.thuongOrPhat = tienLuong * 0.15;
        } else if (this.xepLoai == "Khá") {
            this.thuongOrPhat = tienLuong * 0;
        } else {
            this.thuongOrPhat = tienLuong * (-0.1);
        }
    }

    public NhanVien() {
    }

    public void nhapNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã Nhân Viên");
        maNhanVien = scanner.nextLine();
        System.out.println("Nhập Tên Nhân Viên");
        tenNhanVien = scanner.nextLine();
        System.out.println("Nhập Chức Vụ");
        chucVu = scanner.nextLine();
        System.out.println("Nhập Số Ngày Công");
        soNgayCong = scanner.nextInt();
        System.out.println("Nhập Tiền Lương");
        tienLuong = scanner.nextDouble();
        listNv.add(new NhanVien(maNhanVien, tenNhanVien, chucVu, soNgayCong, tienLuong));
    }

    public void inNhanVien() {
        for (NhanVien nhanVien : listNv) {
            System.out.println(nhanVien.maNhanVien);
            System.out.println(nhanVien.tenNhanVien);
            System.out.println(nhanVien.chucVu);
            System.out.println(nhanVien.soNgayCong);
            System.out.println(nhanVien.tienLuong);
            System.out.println(nhanVien.xepLoai);
        }
    }

    public void sort() {
        Collections.sort(listNv, Comparator.comparingInt(nv -> nv.soNgayCong));
    }

    public void menu() {
        do {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    nhapNhanVien();
                    break;
                case 2:
                    inNhanVien();
                    break;
                case 3:
                    sort();
                    inNhanVien();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
