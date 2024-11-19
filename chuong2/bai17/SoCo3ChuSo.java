package chuong2.bai17;

//a^3 + b^3 + c^3 = abc
public class SoCo3ChuSo {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++) {
            int soHangTram=i/100;
            int soHangChuc=(i-100*soHangTram)/10;
            int soHangDV=i-100*soHangTram-10*soHangChuc;
            if((soHangTram*soHangTram*soHangTram +
                soHangChuc*soHangChuc*soHangChuc +
                soHangDV*soHangDV*soHangDV)==i) 
                    System.out.println(i);
        }
    }
}
