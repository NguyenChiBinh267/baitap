package chuong3.bai10;

import java.util.Scanner;

public abstract class Hocvien {
    protected String hoTen;
    protected String diaChi;
    protected int loaiUuTien;
    public Hocvien() {
    }
    public Hocvien(String hoTen, String diaChi, int loaiUuTien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiUuTien = loaiUuTien;
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
    
    public int getLoaiUuTien() {
        return loaiUuTien;
    }
    public void setLoaiUuTien(int loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin(){
        System.out.println("Nhap ho ten, dia chi, uu tien");
        Scanner sc = new Scanner(System.in);
        this.hoTen=sc.nextLine();
        this.diaChi=sc.nextLine();
        this.loaiUuTien=sc.nextInt();
        sc.nextLine();
    }
    public abstract int hocPhi();

    public String inThongTin() {
        return "Hocvien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiUuTien=" + loaiUuTien + "]";
    }
}
