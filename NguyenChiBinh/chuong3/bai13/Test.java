package chuong3.bai13;

public class Test {
    public static void main(String[] args) {
        LaoDongPhoThong p1=new LaoDongPhoThong();
        p1.nhapThongTin();
        KiSu p2=new KiSu();
        p2.nhapThongTin();
        System.out.println(p1.inThongTin() + "\n" + p2.inThongTin());
    }
}
