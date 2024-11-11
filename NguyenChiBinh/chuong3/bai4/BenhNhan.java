package chuong3.bai4;

public class BenhNhan extends Nguoi{
    protected String tienSu;
    protected String chanDoan;
    protected BenhVien benhVien;
    
    public BenhNhan() {
        super();
    }
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }
    public String getTienSu() {
        return tienSu;
    }
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }
    public String getChanDoan() {
        return chanDoan;
    }
    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }
    public BenhVien getBenhVien() {
        return benhVien;
    }
    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    @Override
    public String toString() {
        return super.toString() + " BenhNhan [tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
    }
    
}
