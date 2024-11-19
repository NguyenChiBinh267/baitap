package chuong3.bai13;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
    protected int luongCoBan;
    protected double heSoLuong;
    private int soNgayCong;
    
    public KiSu() {
        super();
    }
    public KiSu(String hoTen, String diaChi, int luongCoBan, double heSoLuong, int soNgayCong) {
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
        if(soNgayCong>=25) return luongCoBan*heSoLuong + 2000000;
        else if(soNgayCong<25 && soNgayCong>15) return luongCoBan*heSoLuong + 1000000;
        else return luongCoBan*heSoLuong + 500000;
    }
    public String inThongTin() {
        return super.inThongTin() + "KiSu [luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + ", luong=" + tinhLuong() + "]";
    }

}
