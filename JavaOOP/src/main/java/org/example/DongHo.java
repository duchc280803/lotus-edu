package org.example;

import java.util.Calendar;

public class DongHo {

    private Integer gio;

    private Integer phut;

    private Integer giay;

    private Boolean laBuoiSang;

    public DongHo() {
        System.out.println("Mời Nhập Giờ");
        this.gio = Main.inputInteger();
        if (this.gio < 0 || this.gio >= 24) {
            System.out.println("Nhập Sai Nhập Lại Giờ");
            this.gio = Main.inputInteger();
        }
        System.out.println("Mời Nhập Phút");
        this.phut = Main.inputInteger();
        if (this.phut < 0 || this.phut >= 60) {
            System.out.println("Nhập Sai Nhập Lại Phút");
            this.phut = Main.inputInteger();
        }
        System.out.println("Mời Nhập Giây");
        this.giay = Main.inputInteger();
        if (this.giay < 0 || this.giay >= 60) {
            System.out.println("Nhập Sai Nhập Lại Giây");
            this.giay = Main.inputInteger();
        }
    }

    public DongHo(Integer gio, Integer phut, Integer giay) {
        setGio(gio);
        setPhut(phut);
        setGiay(giay);
    }

    public Integer getGio() {
        return gio;
    }

    public void setGio(Integer gio) {
        this.gio = gio;
    }

    public Integer getPhut() {
        return phut;
    }

    public void setPhut(Integer phut) {
        this.phut = phut;
    }

    public Integer getGiay() {
        return giay;
    }

    public void setGiay(Integer giay) {
        this.giay = giay;
    }

    public Boolean getLaBuoiSang() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, this.gio);
        cal.set(Calendar.MINUTE, this.phut);

        if (cal.get(Calendar.AM_PM) == Calendar.AM) {
            return true;
        } else {
            return false;
        }
    }

    public void inThongTin() {
        System.out.println("Giờ: " + getGio() + " " + "Phút: " + getPhut() + " " + "Giây: " + " " + getGiay());
        System.out.println("Bây Giờ Đang Là: " + (getLaBuoiSang() == true ? "Buổi Sáng" : "Buổi Chiều"));
    }

    public DongHo layKhoangThoiGian(DongHo dh) {
        int a = Math.abs(gio * 3600 + phut * 60 + gio - dh.gio * 3600 - dh.phut - dh.giay);
        return new DongHo(a / 3600, (a % 3600 / 60), (a % 3600) % 60);
    }
}
