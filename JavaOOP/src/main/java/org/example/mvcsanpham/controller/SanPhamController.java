package org.example.mvcsanpham.controller;

import org.example.mvcsanpham.model.LoaiSanPham;
import org.example.mvcsanpham.model.NhaCungCap;
import org.example.mvcsanpham.model.SanPham;

import java.util.*;

public class SanPhamController {

    private List<SanPham> listSanPham = new ArrayList<>();

    private List<NhaCungCap> listNcc = new ArrayList<>();

    private List<LoaiSanPham> listLsp = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public NhaCungCap themNhaCungCap() {
        System.out.println("Mời Nhập Mã Nhà Cung Cấp");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời Nhập Tên Nhà Cung Cấp");
        String ten = scanner.nextLine();
        System.out.println("Mời Nhập sdt Nhà Cung Cấp");
        int sdt = Integer.parseInt(scanner.nextLine());
        NhaCungCap nhaCungCap = new NhaCungCap(ma, ten, sdt);
        listNcc.add(nhaCungCap);
        return nhaCungCap;
    }

    public LoaiSanPham themLoaiSanPham() {
        System.out.println("Mời Nhập Mã Loại Sản Phẩm");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời Nhập Tên Loại Sản Phẩm");
        String ten = scanner.nextLine();
        LoaiSanPham loaiSanPham = new LoaiSanPham(ma, ten);
        listLsp.add(loaiSanPham);
        return loaiSanPham;
    }

    public SanPham themSanPham(SanPham sanPham) {
        LoaiSanPham loaiSanPham = null;
        NhaCungCap nhaCungCap = null;
        if (listLsp.isEmpty()) {
            System.out.println("Loại sản phẩm chưa tồn tại. Bạn có muốn thêm loại sản phẩm mới không? (yes/no)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                this.themLoaiSanPham();
            }
        }
        if (listNcc.isEmpty()) {
            System.out.println("Nhà Cung Cấp chưa tồn tại. Bạn có muốn thêm nhà cung cấp mới không? (yes/no)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                this.themNhaCungCap();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Chọn Mã Loại Sản Phẩm");
            int maLoai = Integer.parseInt(scanner.nextLine());
            for (LoaiSanPham lsp : listLsp) {
                if (lsp.getMaLoai() == maLoai) {
                    loaiSanPham = lsp;
                    break;
                }
            }

            System.out.println("Chọn Mã Nhà Cung Cấp");
            int maNcc = Integer.parseInt(scanner.nextLine());
            for (NhaCungCap ncc : listNcc) {
                if (ncc.getNhaCungCap() == maNcc) {
                    nhaCungCap = ncc;
                    break;
                }
            }
            System.out.println("Mời Nhập Mã Sản Phẩm");
            int ma = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời Nhập Tên Sản Phẩm");
            String ten = scanner.nextLine();
            sanPham = new SanPham(ma, ten, loaiSanPham, nhaCungCap);
            listSanPham.add(sanPham);
        }
        return sanPham;
    }

    public void inThongTin() {
        for (SanPham x : listSanPham) {
            System.out.println("Mã Sản Phẩm: " + x.getMaSanPham() + "," + " Tên Sản Phẩm: " + x.getTen());
            System.out.println("Mã Loại Sản Phẩm: " + x.getLoaiSanPham().getMaLoai() + ","
                    + " Tên Loại Sản Phẩm: " + x.getLoaiSanPham().getTenLoai());
            System.out.println("Mã NCC: " + x.getNhaCungCap().getNhaCungCap() + ","
                    + " Tên NCC: " + x.getNhaCungCap().getTen() + "," + "Số Điện Thoại NCC: "
                    + x.getNhaCungCap().getSoDienThoai());
        }
    }

    public void hienLoai(int maLoai) {
        List<SanPham> filteredList = new ArrayList<>();
        for (SanPham x : listSanPham) {
            if (x.getLoaiSanPham().getMaLoai().equals(maLoai)) {
                filteredList.add(x);
            }
        }

        Collections.sort(filteredList, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Integer.compare(o1.getNhaCungCap().getNhaCungCap(), o2.getNhaCungCap().getNhaCungCap());
            }
        });

        for (SanPham x : filteredList) {
            System.out.println("Mã Sản Phẩm: " + x.getMaSanPham() + "," + " Tên Sản Phẩm: " + x.getTen());
            System.out.println("Mã Loại Sản Phẩm: " + x.getLoaiSanPham().getMaLoai() + ","
                    + " Tên Loại Sản Phẩm: " + x.getLoaiSanPham().getTenLoai());
            System.out.println("Mã NCC: " + x.getNhaCungCap().getNhaCungCap() + ","
                    + " Tên NCC: " + x.getNhaCungCap().getTen() + "," + "Số Điện Thoại NCC: "
                    + x.getNhaCungCap().getSoDienThoai());
        }
    }

    public void hienNcc(int nhaCC) {
        List<SanPham> filteredList = new ArrayList<>();
        for (SanPham x : listSanPham) {
            if (x.getNhaCungCap().getNhaCungCap().equals(nhaCC)) {
                filteredList.add(x);
            }
        }

        Collections.sort(filteredList, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Integer.compare(o1.getLoaiSanPham().getMaLoai(), o2.getLoaiSanPham().getMaLoai());
            }
        });

        for (SanPham x : filteredList) {
            System.out.println("Mã Sản Phẩm: " + x.getMaSanPham() + "," + " Tên Sản Phẩm: " + x.getTen());
            System.out.println("Mã Loại Sản Phẩm: " + x.getLoaiSanPham().getMaLoai() + ","
                    + " Tên Loại Sản Phẩm: " + x.getLoaiSanPham().getTenLoai());
            System.out.println("Mã NCC: " + x.getNhaCungCap().getNhaCungCap() + ","
                    + " Tên NCC: " + x.getNhaCungCap().getTen() + "," + "Số Điện Thoại NCC: "
                    + x.getNhaCungCap().getSoDienThoai());
        }
    }
}
