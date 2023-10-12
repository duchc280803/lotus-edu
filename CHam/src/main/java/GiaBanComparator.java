import java.util.Comparator;

public class GiaBanComparator implements Comparator<SanPham> {
    @Override
    public int compare(SanPham o1, SanPham o2) {
        return Float.compare(o1.getGiaBan(), o2.getGiaBan());
    }
}
