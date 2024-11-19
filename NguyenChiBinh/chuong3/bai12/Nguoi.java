package chuong3.bai12;

import java.util.Scanner;

public abstract class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    public Nguoi() {
    }
    public Nguoi(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
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
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        System.out.println("Nhap ho ten, ngay sinh, dia chi: ");
        Scanner sc=new Scanner(System.in);
        this.hoTen=sc.nextLine();
        this.ngaySinh=sc.nextLine();
        this.diaChi=sc.nextLine();
    }
    public abstract double tinhDiem();
    public String inThongTin() {
        return "Nguoi [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
    }
}
