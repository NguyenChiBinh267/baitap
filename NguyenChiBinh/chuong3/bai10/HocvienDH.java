package chuong3.bai10;

import java.util.Scanner;

public class HocvienDH extends Hocvien {
    protected int soBuoiDH;
    protected int donGiaDH;
    public HocvienDH() {
        super();
    }
    public HocvienDH(String hoTen, String diaChi, int loaiUuTien, int soBuoiDH, int donGiaDH) {
        super(hoTen, diaChi, loaiUuTien);
        this.soBuoiDH = soBuoiDH;
        this.donGiaDH = donGiaDH;
    }
    
    public int getSoBuoiDH() {
        return soBuoiDH;
    }
    public void setSoBuoiDH(int soBuoiDH) {
        this.soBuoiDH = soBuoiDH;
    }
    public int getDonGiaDH() {
        return donGiaDH;
    }
    public void setDonGiaDH(int donGiaDH) {
        this.donGiaDH = donGiaDH;
    }
    @SuppressWarnings("resource")
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap so buoi, don gia DH: ");
        Scanner sc = new Scanner(System.in);
        this.soBuoiDH=sc.nextInt();
        this.donGiaDH=sc.nextInt();
        sc.nextLine();
    }
    public int hocPhi() {
        int total=soBuoiDH*donGiaDH;
        switch (loaiUuTien) {
            case 0:
                break;
            case 1:
                total -= 1000000;
                break;
            case 2:
                total -= 500000;
                break;
            default:
                System.out.println("Loai uu tien nhap vao khong hop le");
                break;
        }
        if (total<0) total = 0;
        return total;
    }
    public String inThongTin() {
        return super.inThongTin() + "HocvienDH [soBuoiDH=" + soBuoiDH + ", donGiaDH=" + donGiaDH + ", Hoc phi =" + hocPhi() + "]";
    }
}
