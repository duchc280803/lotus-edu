package model;

import helper.InputHelper;
import service.CatService;

public class Cat implements CatService {

    private Integer id;

    private String ten;

    private Integer tuoi;

    private Integer gioiTinh;

    private String sound;

    public Cat() {
        System.out.println("Mời Nhập Id");
        id = InputHelper.readInt();
        System.out.println("Mời Nhập Tên");
        ten = InputHelper.readString();
        System.out.println("Mời Nhập Tuổi");
        tuoi = InputHelper.readInt();
        System.out.println("Mời Nhập Giới Tính");
        gioiTinh = InputHelper.readInt();
        System.out.println("Mời Nhập Tiếng Kêu");
        sound = InputHelper.readString();
    }

    public Integer getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public void sound(String sound) {
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return sound;
    }

    public void inThongTin() {
        System.out.println("Id Con Mèo: " + getId());
        System.out.println("Tên Con Mèo: " + getId());
        System.out.println("Tuổi Con Mèo: " + getId());
        System.out.println("Giới Tính Con Mèo: " + (getId() == 1 ? "Con Cái" : "Con Đực"));
        System.out.println("Tiếng Kêu Con Mèo: " + getSound());
    }

}
