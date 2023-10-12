package org.example;

public class SoNguyen {

    private Integer giaTri;

    private Boolean laSoChan;

    private Boolean laSoNguyenTo;

    private Boolean laSoDoiXung;

    public SoNguyen() {
        System.out.println("Mời Nhập Giá Trị");
        this.giaTri = Main.inputInteger();
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
        System.out.println("Số Nguyên Có Giá Trị: " + getGiaTri() + "; "
                + (getLaSoChan() == true ? "Là Số Chẵn" : "Không Là Số Chẵn") + "; "
                + (getLaSoNguyenTo() == true ? "Là Số Nguyên Tố" : "Không là Số Nguyên Tố") + "; "
                + (getLaSoDoiXung() == true ? "Là Số Đối Xứng" : "Không Là Số Đối Xưứng"));
    }
}
