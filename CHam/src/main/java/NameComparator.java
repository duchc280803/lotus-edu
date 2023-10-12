import java.util.Comparator;

public class NameComparator implements Comparator<HocSinh> {

    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }
}
