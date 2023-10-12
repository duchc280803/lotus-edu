public class QueQuan {

    private String xaPhuong;

    private String quanHuyen;

    private String thanhPho;

    public QueQuan() {
    }

    public QueQuan(String xaPhuong, String quanHuyen, String thanhPho) {
        this.xaPhuong = xaPhuong;
        this.quanHuyen = quanHuyen;
        this.thanhPho = thanhPho;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }
}