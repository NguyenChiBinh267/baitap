package chuong3.bai10;

public class Test {
    public static void main(String[] args) {
        HocvienDH p1=new HocvienDH();
        p1.nhapThongTin();
        HocvienLT p2=new HocvienLT();
        p2.nhapThongTin();
        System.out.println(p1.inThongTin() + "\n" + p2.inThongTin());
    }
}
