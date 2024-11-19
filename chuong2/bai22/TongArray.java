package chuong2.bai22;

import java.util.Scanner;

public class TongArray {
    public static void main(String[] args) {
        System.out.println("Nhap n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Double[] a=new Double[n];
        for (int i=0; i<n; i++) {
            System.out.print("a[" + i + "]=" );
            a[i]=sc.nextDouble();
        }
        double total=0;
        for (int i=0; i<n; i++) {
            total += a[i];
        }
        System.out.println("Tong=" + total);
        sc.close();
    }
}
