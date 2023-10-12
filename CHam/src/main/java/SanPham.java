import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SanPham {

    private String tenSanPham;

    private String loaiSanPham;

    private float giaBan;

    private String ghiChu;

    public SanPham(String tenSanPham, String loaiSanPham, int giaBan, String ghiChu) {
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.giaBan = giaBan;
        this.ghiChu = ghiChu;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    private List<SanPham> sanPhamList = new ArrayList<>();

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin sản phẩm #" + (i + 1));
            System.out.print("Tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Loại sản phẩm: ");
            String loai = scanner.nextLine();
            System.out.print("Giá bán: ");
            int gia = Integer.parseInt(scanner.nextLine());
            System.out.print("Ghi chú: ");
            String ghiChu = scanner.nextLine();
            sanPhamList.add(new SanPham(ten, loai, gia, ghiChu));
        }
    }

    public void xuatThongTin() {
        for (SanPham x : sanPhamList) {
            System.out.println(x.tenSanPham);
            System.out.println(x.loaiSanPham);
            System.out.println(x.giaBan);
            System.out.println(x.ghiChu);
        }
    }

    public void sort() {
        Collections.sort(sanPhamList, new GiaBanComparator());
    }

}
