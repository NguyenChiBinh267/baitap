package chuong3.bai5;

public class Test {
    public static void main(String[] args) {
        Truong truong = new Truong("HaUI", "Pho Nhon", "null");
        SinhVien sv = new SinhVien("Nam", 18, 'M', "CNTT02", "CNTT", truong);
        System.out.println(sv.toString());
    }
}
