package chuong2.bai19;

import java.util.Scanner;

public class TinhGiay {
    public static void main(String[] args) {
        System.out.println("Nhap so gio, phut, giay");
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        System.out.println("So giay=" + (h*3600+m*60+s));
        sc.close();
    }
}
