package chuong3.bai11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
    protected int luongCoBan;
    protected int heSoLuong;
    protected int thamNien;
   
    public GVCoHuu(String hoTen, String diaChi, int luongCoBan, int heSoLuong, int thamNien) {
        super(hoTen, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }
    public GVCoHuu() {
        super();
    }
    public int getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public int getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public int getThamNien() {
        return thamNien;
    }
    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong co ban, hs luong, tham nien: ");
        this.luongCoBan=sc.nextInt();
        this.heSoLuong=sc.nextInt();
        this.thamNien=sc.nextInt();
        sc.nextLine();
    }
    public double tinhLuong() {
        double phuCap=0;
        for (int i=0; i<thamNien; i++) {
            if(i<5) ;
            else phuCap=i*0.01*luongCoBan;
        }
        return luongCoBan*heSoLuong + phuCap;
    }
    public String inThongTin() {
        return super.inThongTin() + "GVCoHuu [luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luong=" + tinhLuong() +"]";
    }
    
    
    
    
}
