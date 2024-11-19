package chuong3.bai14;

import java.util.Scanner;

public abstract class CongNhan {
    protected String hoTen;
    protected String diaChi;
    public CongNhan(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public CongNhan() {
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
        System.out.println("Nhap ho ten, dia chi: ");
        this.hoTen=sc.nextLine();
        this.diaChi=sc.nextLine();
        
    }
    public abstract double tinhLuong();
    public String inThongTin() {
        return "NguoiLaoDong [hoTen=" + hoTen + ", diaChi=" + diaChi + "]";
    }
}
