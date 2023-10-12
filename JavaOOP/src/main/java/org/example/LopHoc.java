package org.example;

public class LopHoc {

    private Integer classCode;

    private String className;

    private Integer number;

    private String address;

    private String teacher;

    public LopHoc() {
    }

    public LopHoc(Integer classCode, String className, Integer number, String address, String teacher) {
        this.classCode = classCode;
        this.className = className;
        this.number = number;
        this.address = address;
        this.teacher = teacher;
    }

    public Integer getClassCode() {
        return classCode;
    }

    public void setClassCode(Integer classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void inThongTin() {
        System.out.println("Lớp: " + getClassName() + " Có Mã Là: " + getClassCode());
        System.out.println("Lớp Có Sĩ Sỗ Học Sinh Là: " + getNumber() + " Có Giáo Viên Chủ Nhiệm Là: " + getTeacher());
    }
}
