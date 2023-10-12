package org.example.mvcsohoc.model;

public class SoHoc {

    private Integer giaTri;

    private Boolean laSoChan;

    private Boolean laSoLe;

    private Boolean laSoNguyenTo;

    private Boolean laSoDoiXung;

    public SoHoc() {
    }

    public SoHoc(Integer giaTri) {
        this.giaTri = giaTri;
    }

    public Integer getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(Integer giaTri) {
        this.giaTri = giaTri;
    }

    public Boolean getLaSoChan() {
        if (giaTri % 2 == 0) {
            laSoChan = true;
        } else {
            laSoChan = false;
        }
        return laSoChan;
    }

    public Boolean getLaSoLe() {
        if (giaTri % 2 != 0) {
            laSoLe = true;
        } else {
            laSoLe = false;
        }
        return laSoLe;
    }

    public Boolean getLaSoNguyenTo() {
        if (giaTri < 2) {
            laSoNguyenTo = false;
        } else {
            int can = (int) Math.sqrt(giaTri);
            boolean isNguyenTo = true;
            for (int i = 2; i <= can; i++) {
                if (giaTri % i == 0) {
                    isNguyenTo = false;
                    break;
                }
            }
            laSoNguyenTo = isNguyenTo;
        }
        return laSoNguyenTo;
    }

    public Boolean getLaSoDoiXung() {
        int luuGiaTri = giaTri;
        int reversed = 0;
        while (giaTri > 0) {
            int digit = giaTri % 10;
            reversed = reversed * 10 + digit;
            giaTri /= 10;
        }
        if (luuGiaTri == reversed) {
            laSoDoiXung = true;
        } else {
            laSoDoiXung = false;
        }
        return laSoDoiXung;
    }

    public void inThongTin() {
        System.out.println("Giá trị: " + getGiaTri());
    }
}
