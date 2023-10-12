import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SoPhuc {
    private int phanThuc;
    private int phanAo;

    public SoPhuc(int phanThuc, int phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public int getPhanThuc() {
        return phanThuc;
    }

    public int getPhanAo() {
        return phanAo;
    }


    List<SoPhuc> list = new ArrayList<>();

    public void nhapSoPhuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần thực: ");
        phanThuc = scanner.nextInt();
        System.out.print("Nhập phần ảo: ");
        phanAo = scanner.nextInt();
        list.add(new SoPhuc(phanThuc, phanAo));
    }

    public void xuatSoPhuc() {
        for (SoPhuc x : list) {
            System.out.println("Số phức: " + x.phanThuc + " + " + x.phanAo + "i");
        }
    }

    public void phanAo() {
        for (SoPhuc x : list) {
            if (x.phanAo > 999) {
                System.out.println(x.phanAo);
            }
        }
    }
}
