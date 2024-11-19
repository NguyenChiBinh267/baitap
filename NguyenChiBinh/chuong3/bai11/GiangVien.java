package chuong3.bai11;

import java.util.Scanner;

public abstract class GiangVien {
    protected String hoTen;
    protected String diaChi;
    public GiangVien() {
    }
    public GiangVien(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten, dia chi, loai GV(1: GV co huu, 2: GV thinh giang): ");
        this.hoTen=sc.nextLine();
        this.diaChi=sc.nextLine();
    }
    public abstract double tinhLuong();
    public String inThongTin() {
        return "GiangVien [hoTen=" + hoTen + ", diaChi=" + diaChi +  "]";
    }
    
}
