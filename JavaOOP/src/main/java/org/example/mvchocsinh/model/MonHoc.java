package org.example.mvchocsinh.model;

import java.util.ArrayList;
import java.util.List;

public class MonHoc {

    private Integer maMonHoc;

    private String tenMonHoc;

    private Integer soTiet;

    private List<Diem> diemList = new ArrayList<>();
    private List<HocSinh> hocSinhList = new ArrayList<>();

    public MonHoc() {
    }

    public MonHoc(Integer maMonHoc, String tenMonHoc, Integer soTiet) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTiet = soTiet;
    }

    public Integer getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(Integer maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public Integer getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(Integer soTiet) {
        this.soTiet = soTiet;
    }

    public List<Diem> getDiemList() {
        return diemList;
    }

    public void setDiemList(List<Diem> diemList) {
        this.diemList = diemList;
    }

    public List<HocSinh> getHocSinhList() {
        return hocSinhList;
    }

    public void setHocSinhList(List<HocSinh> hocSinhList) {
        this.hocSinhList = hocSinhList;
    }
}
