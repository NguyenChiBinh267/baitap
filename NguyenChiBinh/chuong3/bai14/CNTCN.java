package chuong3.bai14;

import java.util.Scanner;

public class CNTCN extends CongNhan {
    protected int luongCoBan;
    protected double heSoLuong;
    private int soNgayCong;
    
    public CNTCN() {
        super();
    }
    public CNTCN(String hoTen, String diaChi, int luongCoBan, double heSoLuong, int soNgayCong) {
        super(hoTen, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }
    public int getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public int getSoNgayCong() {
        return soNgayCong;
    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap luong CB, hs luong, ngay cong: ");
        this.luongCoBan=sc.nextInt();
        this.heSoLuong=sc.nextDouble();
        this.soNgayCong=sc.nextInt();
        sc.nextLine();
    }
    public double tinhLuong() {
        if(soNgayCong>=20) return luongCoBan*heSoLuong + 1.2*luongCoBan;
        else return luongCoBan*heSoLuong;
    }
    public String inThongTin() {
        return super.inThongTin() + "KiSu [luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + ", luong=" + tinhLuong() + "]";
    }
}
