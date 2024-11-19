package chuong2.bai20;

import java.util.Scanner;

public class DoF {
    public static void main(String[] args) {
        System.out.println("Nhap do C");
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        System.out.println("Do F=" + c*1.8+32);
        sc.close();
    }
}
