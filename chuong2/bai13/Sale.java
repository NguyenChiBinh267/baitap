package chuong2.bai13;

import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        System.out.println("Nhap gia ban, % giam gia");
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double d=sc.nextDouble();
        System.out.println("Gia=" + (p-p*d*0.01));
        sc.close();
    }
}
