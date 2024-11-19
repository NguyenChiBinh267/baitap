package chuong3.bai13;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    protected String hoTen;
    protected String diaChi;
    public NguoiLaoDong(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public NguoiLaoDong() {
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
