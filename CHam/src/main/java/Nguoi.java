import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nguoi {

    private String hoTen;

    private int tuoi;

    private int gioiTinh;

    private List<QueQuan> queQuan = new ArrayList<>();

    List<Nguoi> list = new ArrayList<>();

    public Nguoi(String hoTen, int tuoi, int gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời Nhập Họ Tên");
        hoTen = scanner.nextLine();
        tuoi = scanner.nextInt();
        gioiTinh = scanner.nextInt();
        String xaPhuong = scanner.nextLine();
        String quanHuyen = scanner.nextLine();
        String thanhPho = scanner.nextLine();
        list.add(new Nguoi(hoTen, tuoi, gioiTinh));
        queQuan.add(new QueQuan(xaPhuong, quanHuyen, thanhPho));
    }

    public void xuat() {
        for (Nguoi x : list) {
            System.out.println(x.hoTen);
            System.out.println(x.tuoi);
            System.out.println(x.gioiTinh == 1 ? "Nam" : "Nữ");
        }
        for (QueQuan x : queQuan) {
            System.out.println(x.getQuanHuyen());
            System.out.println(x.getThanhPho());
            System.out.println(x.getXaPhuong());
        }
    }
}
