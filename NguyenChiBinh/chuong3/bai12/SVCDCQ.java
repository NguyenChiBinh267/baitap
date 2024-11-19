package chuong3.bai12;

import java.util.Scanner;

public class SVCDCQ extends Nguoi {
    private double tongDKT;
    private int soMKT;
    private double diemKTKTHP;
    public SVCDCQ() {
        super();
    }
    public SVCDCQ(String hoTen, String ngaySinh, String diaChi, double tongDKT, int soMKT, double diemKTKTHP) {
        super(hoTen, ngaySinh, diaChi);
        this.tongDKT = tongDKT;
        this.soMKT = soMKT;
        this.diemKTKTHP = diemKTKTHP;
    }
    public double getTongDKT() {
        return tongDKT;
    }
    public void setTongDKT(double tongDKT) {
        this.tongDKT = tongDKT;
    }
    public int getSoMKT() {
        return soMKT;
    }
    public void setSoMKT(int soMKT) {
        this.soMKT = soMKT;
    }
    public double getDiemKTKTHP() {
        return diemKTKTHP;
    }
    public void setDiemKTKTHP(double diemKTKTHP) {
        this.diemKTKTHP = diemKTKTHP;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap tong diem kt, so mon kt, diem kthp: ");
        Scanner sc=new Scanner(System.in);
        this.tongDKT=sc.nextDouble();
        this.soMKT=sc.nextInt();
        do {
            this.diemKTKTHP=sc.nextDouble();
            if(this.diemKTKTHP>10) System.out.println("Diem khong hop le!");
        } while (this.diemKTKTHP>10);
        
    }
    public double tinhDiem() {
        if ((tongDKT/soMKT + diemKTKTHP)/3>10) {
            System.out.println("Diem nhap vao khong hop le!");
            return 0;
        }
        else return (tongDKT/soMKT + diemKTKTHP)/3;
    }
    public String inThongTin() {
        return super.inThongTin() + "SVCDCQ [tongDKT=" + tongDKT + ", soMKT=" + soMKT + ", diemKTKTHP=" + diemKTKTHP + ", DTB=" + tinhDiem() + "]";
    }
    
}
