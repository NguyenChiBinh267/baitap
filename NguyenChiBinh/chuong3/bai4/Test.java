package chuong3.bai4;

public class Test {
    public static void main(String[] args) {
        BenhVien bv = new BenhVien("Viet Duc", "Ha Noi", "An");
        BenhNhan p = new BenhNhan("Nam", 20, 'M', "Khong", "Ung Thu", bv);
        System.out.println(p.toString());
    }
}
