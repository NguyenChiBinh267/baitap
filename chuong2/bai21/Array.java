package chuong2.bai21;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Nhap n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("a[" + i + "]=" );
            a[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.println(a[i] + " ");
        }
        sc.close();
    }
}
