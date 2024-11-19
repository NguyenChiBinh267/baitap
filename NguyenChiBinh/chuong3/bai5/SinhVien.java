package chuong3.bai5;

public class SinhVien extends Nguoi{
    protected String lop;
    protected String nganh;
    protected Truong truong;
    
    public SinhVien() {
        super();
    }
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public Truong getTruong() {
        return truong;
    }
    public void setTruong(Truong truong) {
        this.truong = truong;
    }
    @Override
    public String toString() {
        return super.toString() + "SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
    }
    
}
