package chuong3.bai12;

public class Test {
    public static void main(String[] args) {
        SVCDCQ p1=new SVCDCQ();
        p1.nhapThongTin();
        SVCDN p2=new SVCDN();
        p2.nhapThongTin();
        System.out.println(p1.inThongTin() + "\n" + p2.inThongTin());
    }
}
