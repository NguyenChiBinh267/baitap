package chuong2.bai7;

import java.util.Scanner;

public class ChoiceCalc {
    public static void main(String[] args) {
        System.out.println("Nhap 2 so nguyen:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Nhap 1 ky tu");
        char ch=sc.next().charAt(0);
        double result=0;
        switch (ch) {
            case 'A':
                result=a+b;
                break;
            case 'S':
                result=a-b;
                break;
            case 'M':
                result=a*b;
                break;
            case 'D':
                result=a/b;
                break;
            default:
                System.out.println("Ky tu nhap khong hop le");
                break;
        }
        System.out.println(result);
        sc.close();
    }
}
