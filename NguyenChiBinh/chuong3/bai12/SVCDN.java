package chuong3.bai12;

import java.util.Scanner;

public class SVCDN extends Nguoi {
    private double tongDKT;
    private int soMKT;
    
    public SVCDN() {
        super();
    }
    public SVCDN(String hoTen, String ngaySinh, String diaChi, int tongDKT, int soMKT) {
        super(hoTen, ngaySinh, diaChi);
        this.tongDKT = tongDKT;
        this.soMKT = soMKT;
    }
    public double getTongDKT() {
        return tongDKT;
    }
    public void setTongDKT(int tongDKT) {
        this.tongDKT = tongDKT;
    }
    public int getSoMKT() {
        return soMKT;
    }
    public void setSoMKT(int soMKT) {
        this.soMKT = soMKT;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap tong diem kt, so mon kt: ");
        Scanner sc=new Scanner(System.in);
        this.tongDKT=sc.nextDouble();
        this.soMKT=sc.nextInt();
    }
    public double tinhDiem() {
        if ((tongDKT/soMKT>10)) {
            System.out.println("Diem nhap vao khong hop le!");
            return 0;
        } else {
            return tongDKT/soMKT;
        }
    }
    public String inThongTin() {
        return super.inThongTin() + "SVCDN [tongDKT=" + tongDKT + ", soMKT=" + soMKT + ", DTB=" + tinhDiem() + "]";
    }

}
