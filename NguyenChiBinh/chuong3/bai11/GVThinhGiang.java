package chuong3.bai11;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
    protected int soTietDay;
    protected int donGia;
    public GVThinhGiang() {
        super();
    }
    public GVThinhGiang(String hoTen, String diaChi, int soTietDay, int donGia) {
        super(hoTen, diaChi);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }
    public int getSoTietDay() {
        return soTietDay;
    }
    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        System.out.println("Nhap so tiet day, don gia: ");
        Scanner sc=new Scanner(System.in);
        this.soTietDay=sc.nextInt();
        this.donGia=sc.nextInt();
        sc.nextLine();
    }
    public double tinhLuong() {
        return soTietDay*donGia - 0.15*(soTietDay*donGia);
    }
    public String inThongTin() {
        return super.inThongTin() + "GVThinhGiang [soTietDay=" + soTietDay + ", donGia=" + donGia + ", luong= " + tinhLuong() + "]";
    }

}
