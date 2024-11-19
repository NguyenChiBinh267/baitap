package chuong2.bai10;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Nhap chieu dai, rong");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Dien tich=" + (a*b) + ",    Chu vi=" + (2*a+b));
        sc.close();
    }
}
