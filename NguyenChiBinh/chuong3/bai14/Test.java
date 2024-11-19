package chuong3.bai14;

public class Test {
    public static void main(String[] args) {
        CNKSP p1=new CNKSP();
        p1.nhapThongTin();
        CNTCN p2=new CNTCN();
        p2.nhapThongTin();
        System.out.println(p1.inThongTin() + "\n" + p2.inThongTin());
    }
}
