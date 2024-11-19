package chuong3.bai10;

import java.util.Scanner;

public class HocvienLT extends Hocvien {
    protected int soBuoiLT;
    protected int donGiaLT;
    public HocvienLT() {
        super();
    }
    public HocvienLT(String hoTen, String diaChi, int loaiUuTien, int soBuoiLT, int donGiaLT) {
        super(hoTen, diaChi, loaiUuTien);
        this.soBuoiLT = soBuoiLT;
        this.donGiaLT = donGiaLT;
    }
    public int getSoBuoiLT() {
        return soBuoiLT;
    }
    public void setSoBuoiLT(int soBuoiLT) {
        this.soBuoiLT = soBuoiLT;
    }
    public int getDonGiaLT() {
        return donGiaLT;
    }
    public void setDonGiaLT(int donGiaLT) {
        this.donGiaLT = donGiaLT;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap so buoi, don gia LT: ");
        Scanner sc = new Scanner(System.in);
        this.soBuoiLT=sc.nextInt();
        this.donGiaLT=sc.nextInt();
        sc.nextLine();
    }
    public int hocPhi() {
        int total=soBuoiLT*donGiaLT;
        switch (loaiUuTien) {
            case 0:
                break;
            case 1:
                total -= 1000000;
                break;
            case 2:
                total -= 800000;
                break;
            default:
                System.out.println("Loai uu tien nhap vao khong hop le");
                break;
        }
        if (total<0) total = 0;
        return total;
    }
    public String inThongTin() {
        return super.inThongTin() + "HocvienLT [soBuoiLT=" + soBuoiLT + ", donGiaLT=" + donGiaLT + ", Hoc phi =" + hocPhi() + "]";
    }
}
