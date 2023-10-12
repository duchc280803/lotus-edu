package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThoiGian {

    private Integer ngay;

    private Integer thang;

    private Integer nam;

    private Boolean laNamNhuan;

    private Integer thu;

    public ThoiGian() {
        System.out.println("Mời Nhập Ngày");
        ngay = Main.inputInteger();
        if (ngay < 1 && ngay > 31) {
            System.out.println("Mời Nhập Lại");
            ngay = Main.inputInteger();
        }
        System.out.println("Mời Nhập Tháng");
        thang = Main.inputInteger();
        if (thang < 1 && ngay > 12) {
            System.out.println("Mời Nhập Lại");
            thang = Main.inputInteger();
        }
        System.out.println("Mời Nhập Năm");
        nam = Main.inputInteger();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        if (nam < 1000 && nam > Integer.parseInt(simpleDateFormat.format(date))) {
            System.out.println("Mời Nhập Lại");
            nam = Main.inputInteger();
        }
    }

    public ThoiGian(Integer ngay, Integer thang, Integer nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public Integer getSoNguyen() {
        return ngay;
    }

    public void setSoNguyen(Integer ngay) {
        this.ngay = ngay;
    }

    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    public Integer getNam() {
        return nam;
    }

    public void setNam(Integer nam) {
        this.nam = nam;
    }

    public Boolean getLaNamNhuan() {
        laNamNhuan = false;
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                if (nam % 400 == 0) {
                    laNamNhuan = true;
                }
            } else {
                laNamNhuan = true;
            }
        }
        return laNamNhuan;
    }

    public Integer getThu() {
        Calendar cal = Calendar.getInstance();
        cal.set(nam, thang - 1, ngay);
        thu = cal.get(Calendar.DAY_OF_MONTH);
        return thu;
    }

    public void layThongTin() {
        System.out.println("Thời Gian Hiện Tại Là: "
                + "Thứ " + getThu() + ","
                + "Ngày " + getSoNguyen() + ","
                + "Tháng " + getThang() + ","
                + "Năm " + getNam() + ","
                + (getLaNamNhuan() == true ? "Có Năm Nhuận" : "Không Có Năm Nhuận"));
    }

    public Long layKhoangThoiGian(ThoiGian thoiGian) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(nam, thang - 1, ngay);
        calendar2.set(thoiGian.getNam(), thoiGian.getThang() - 1, thoiGian.getSoNguyen());
        return (calendar1.getTimeInMillis() - calendar2.getTimeInMillis()) / 24 * 60 * 60 * 1000;
    }
}
