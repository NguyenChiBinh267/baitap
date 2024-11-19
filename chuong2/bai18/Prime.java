package chuong2.bai18;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Nhap n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) d++;
        }
        if (d==0) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("Khong la so nguyen to");
        }
        sc.close();
    }
}
