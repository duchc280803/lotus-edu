import java.util.*;

public class Lop {

    private int maLop;

    private String tenLop;

    private int siSo;

    public Lop(int maLop, String tenLop, int siSo) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
    }

    private List<HocSinh> hocSinhList = new ArrayList<>();

    private List<Lop> lopList = new ArrayList<>();

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        maLop = scanner.nextInt();
        scanner.nextLine();
        tenLop = scanner.nextLine();
        siSo = scanner.nextInt();
        lopList.add(new Lop(maLop, tenLop, siSo));
        for (int i = 0; i <= 3; i++) {
            int maHocSinh = scanner.nextInt();
            scanner.nextLine();
            String hoTen = scanner.nextLine();
            String diaChi = scanner.nextLine();
            String ngaySinh = scanner.nextLine();
            float trungBinh = scanner.nextFloat();
            hocSinhList.add(new HocSinh(maHocSinh, hoTen, diaChi, ngaySinh, trungBinh));
        }
    }

    public void xuat() {
        for (Lop l : lopList) {
            System.out.println(l.maLop);
            System.out.println(l.tenLop);
            System.out.println(l.siSo);
        }

        for (HocSinh l : hocSinhList) {
            System.out.println(l.getMaHocSinh());
            System.out.println(l.getNgaySinh());
            System.out.println(l.getDiaChi());
            System.out.println(l.getTrungBinh());
        }
    }

    public void sort() {
        Collections.sort(hocSinhList, new NameComparator());
    }
}
