import java.util.Scanner;

class Sach {
    String tieuDe;
    String tacGia;
    int giaBan;
    String noiDung;

    public void nhapSach() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tiêu đề sách: ");
        tieuDe = scanner.nextLine();

        System.out.print("Nhập tác giả sách: ");
        tacGia = scanner.nextLine();

        System.out.print("Nhập giá bán sách: ");
        giaBan = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline bỏ qua

        System.out.print("Nhập nội dung sách: ");
        noiDung = scanner.nextLine();
    }

    public void xuatSach() {
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá bán: " + giaBan + " đồng");
        System.out.println("Nội dung: " + noiDung);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline bỏ qua

        Sach[] danhSachSach = new Sach[n];

        // Nhập thông tin cho từng sách
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            danhSachSach[i] = new Sach();
            danhSachSach[i].nhapSach();
        }

        System.out.print("Nhập giá x: ");
        int x = scanner.nextInt();

        // Xuất các sách có giá bán > x
        System.out.println("Các sách có giá bán > " + x + " đồng:");
        for (Sach sach : danhSachSach) {
            if (sach.giaBan > x) {
                sach.xuatSach();
                System.out.println();
            }
        }
    }
}
