package chuong3.bai14;

import java.util.Scanner;

public class CNKSP extends CongNhan {
    protected int soSP;
    protected int donGiaSP;
    public CNKSP() {
    }
    public CNKSP(String hoTen, String diaChi, int soSP, int donGiaSP) {
        super(hoTen, diaChi);
        this.soSP = soSP;
        this.donGiaSP = donGiaSP;
    }
    public int getSoSP() {
        return soSP;
    }
    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    public int getDonGiaSP() {
        return donGiaSP;
    }
    public void setDonGiaSP(int donGiaSP) {
        this.donGiaSP = donGiaSP;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so san pham, don gia sp: ");
        this.soSP=sc.nextInt();
        this.donGiaSP=sc.nextInt();
        sc.nextLine();
    }
    public double tinhLuong() {
        if(soSP-1000>=150) return soSP*donGiaSP + 1500000;
        else if(soSP-1000>=100) return soSP*donGiaSP + 1000000;
        else return soSP*donGiaSP;
    }
    public String inThongTin() {
        return super.inThongTin() + "CongNhanKSP [soSP=" + soSP + ", donGiaSP=" + donGiaSP + ", luong=" + tinhLuong() + "]";
    }

}
