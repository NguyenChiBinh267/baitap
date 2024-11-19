package chuong3.bai13;

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
    protected int soNgayCong;
    protected int donGiaNgayCong;
    public LaoDongPhoThong() {
        super();
    }
    public LaoDongPhoThong(String hoTen, String diaChi, int soNgayCong, int donGiaNgayCong) {
        super(hoTen, diaChi);
        this.soNgayCong = soNgayCong;
        this.donGiaNgayCong = donGiaNgayCong;
    }
    public int getSoNgayCong() {
        return soNgayCong;
    }
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    public int getDonGiaNgayCong() {
        return donGiaNgayCong;
    }
    public void setDonGiaNgayCong(int donGiaNgayCong) {
        this.donGiaNgayCong = donGiaNgayCong;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so ngay cong, don gia ngay cong: ");
        this.soNgayCong=sc.nextInt();
        this.donGiaNgayCong=sc.nextInt();
    }
    public double tinhLuong() {
        if(soNgayCong>=25) return soNgayCong*donGiaNgayCong + 1000000;
        else if(soNgayCong<25 && soNgayCong>15) return soNgayCong*donGiaNgayCong + 700000;
        else return soNgayCong*donGiaNgayCong;
    }
    public String inThongTin() {
        return super.inThongTin() + "LaoDongPhoThong [soNgayCong=" + soNgayCong + ", donGiaNgayCong=" + donGiaNgayCong + ", luong=" + tinhLuong() + "]";
    }

}
