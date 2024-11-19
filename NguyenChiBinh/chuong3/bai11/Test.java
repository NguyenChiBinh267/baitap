package chuong3.bai11;

public class Test {
    public static void main(String[] args) {
        GVCoHuu p1=new GVCoHuu();
        p1.nhapThongTin();
        GVThinhGiang p2=new GVThinhGiang();
        p2.nhapThongTin();
        System.out.println(p1.inThongTin() + "\n" + p2.inThongTin());
    }
}
