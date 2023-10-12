package org.example;

public class BinhLinh {

    protected String ten;

    protected Integer sucManh = 50;

    protected Boolean trangBi;

    public BinhLinh() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSucManh() {
        return sucManh;
    }

    public Boolean getTrangBi() {
        return trangBi;
    }

    public void setSucManh(Integer sucManh) {
        this.sucManh = sucManh;
    }

    public void setTrangBi(Boolean trangBi) {
        this.trangBi = trangBi;
    }

    public void inThongTin() {
        System.out.println(getTen() + "Có Chỉ Số Sức Mạnh Là: " + tinhSucManh());
    }

    public double tinhSucManh() {
        return trangBi ? sucManh * 1.1 : sucManh;
    }

    public int chienDau(BinhLinh linh) {
        return sucManh < linh.getSucManh() ? 1 : sucManh == linh.getSucManh() ? 0 : 1;
    }
}
