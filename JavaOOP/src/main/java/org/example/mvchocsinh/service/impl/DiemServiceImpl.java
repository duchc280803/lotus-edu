package org.example.mvchocsinh.service.impl;

import org.example.mvchocsinh.model.Diem;
import org.example.mvchocsinh.model.HocSinh;
import org.example.mvchocsinh.model.MonHoc;
import org.example.mvchocsinh.service.DiemService;

import java.util.ArrayList;
import java.util.List;

public class DiemServiceImpl implements DiemService {

    private List<HocSinh> listHocSinh = new ArrayList<>();

    private List<MonHoc> listMonHoc = new ArrayList<>();

    private List<Diem> listDiem = new ArrayList<>();

    @Override
    public HocSinh createHocSinh(HocSinh hocSinh) {
        listHocSinh.add(hocSinh);
        return hocSinh;
    }

    @Override
    public MonHoc createMonHoc(MonHoc monHoc) {
        listMonHoc.add(monHoc);
        return monHoc;
    }

    @Override
    public void chamDiem(Integer maHocSinh, Integer maMonHoc, Double diem) {
        boolean daCoDiem = false;
        for (Diem diemMonHoc : listDiem) {
            if (diemMonHoc.getMaHocSinh() == maHocSinh && diemMonHoc.getMaMonHoc() == maMonHoc) {
                diemMonHoc.diem = diem;
                daCoDiem = true;
                break;
            }
        }

        if (!daCoDiem) {
            listDiem.add(new Diem(maHocSinh, maMonHoc, diem));
        }
    }

    @Override
    public void bangDiem(Integer maHocSinh) {
        for (HocSinh x : listHocSinh) {
            if (x.getMaHocSinh().equals(maHocSinh)) {
                System.out.println("Bảng Điểm Của Học Sinh" + x.getDiemList());
            }
        }
    }

    @Override
    public void tongKetMon(Integer maMonHoc) {
        for (MonHoc x : listMonHoc) {
            if (x.getMaMonHoc().equals(maMonHoc)) {
                System.out.println("Điểm: " + x.getDiemList() + "," + "Của Học Sinh" + x.getHocSinhList());
            }
        }
    }

    @Override
    public void inThongTinHocSinh() {
        for (HocSinh x : listHocSinh) {
            System.out.println(x.getMaHocSinh());
            System.out.println(x.getTen());
            System.out.println(x.getNgaySinh());
        }
    }

    @Override
    public void inThongTinMonHoc() {
        for (MonHoc x : listMonHoc) {
            System.out.println(x.getMaMonHoc());
            System.out.println(x.getTenMonHoc());
            System.out.println(x.getSoTiet());
        }
    }
}
