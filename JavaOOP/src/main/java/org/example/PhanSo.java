package org.example;

public class PhanSo {

    private Integer tuSo;

    private Integer mauSo;

    public PhanSo() {
    }

    public PhanSo(Integer tuSo, Integer mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public Integer getTuSo() {
        return tuSo;
    }

    public void setTuSo(Integer tuSo) {
        this.tuSo = tuSo;
    }

    public Integer getMauSo() {
        return mauSo;
    }

    public void setMauSo(Integer mauSo) {
        this.mauSo = mauSo;
    }

    public void inThongTin() {
        System.out.println("Phân Số Là: " + getTuSo() + "/" + getMauSo());
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / i);
        this.setMauSo(this.getMauSo() / i);
    }

    public void congPhanSo(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }

    public void truPhanSo(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }

}
