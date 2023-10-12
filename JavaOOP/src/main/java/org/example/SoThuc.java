package org.example;

public class SoThuc {

    private Double giaTri;

    private Boolean laSoDuong;

    public SoThuc() {
    }

    public SoThuc(Double giaTri) {
        this.giaTri = giaTri;
        this.laSoDuong = giaTri > 0;
    }

    public Double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(Double giaTri) {
        this.giaTri = giaTri;
    }

    public Boolean getLaSoDuong() {
        return laSoDuong;
    }

    public double TimMax(double SoThuc1, double SoThuc2, double SoThuc3) {
        double max = SoThuc1;
        if (SoThuc2 > max) {
            max = SoThuc2;
        }
        if (SoThuc3 > max) {
            max = SoThuc3;
        }
        return max;
    }

    public double TinhCanBacN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số mũ phải lớn hơn hoặc bằng 0.");
        }
        return Math.pow(giaTri, 1.0 / n);
    }
}
