package chuong2.bai6;

import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
        System.out.println("Nhap 2 so nguyen:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Tong=" + (a+b) +
                           "\nHieu=" + (a-b) +
                           "\nTich=" + (a*b) +
                           "\nThuong=" + (a/b)     );
        sc.close();
    }
}
