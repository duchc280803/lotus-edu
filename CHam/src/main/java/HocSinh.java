public class HocSinh {
    private int maHocSinh;

    private String hoTen;

    private String diaChi;

    private String ngaySinh;

    private float trungBinh;

    public HocSinh(int maHocSinh, String hoTen, String diaChi, String ngaySinh, float trungBinh) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.trungBinh = trungBinh;
    }

    public int getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getTrungBinh() {
        return trungBinh;
    }

    public void setTrungBinh(float trungBinh) {
        this.trungBinh = trungBinh;
    }
}
