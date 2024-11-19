package chuong2.bai5;

import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen, thuc, ky tu, chuoi:");
        int i=sc.nextInt();
        double d=sc.nextDouble();
        
        char ch=sc.next().charAt(0);
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(i + " " + d + " " + ch + " " + s);
        sc.close();
    }
}
