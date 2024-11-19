package chuong2.bai16;

import java.util.Scanner;

public class TinhGiaiThua {
    public static int GiaiThua(int n){
        if (n==1) return 1;
        else return GiaiThua(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println("Nhap n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(GiaiThua(n));
        sc.close();
    }
}
