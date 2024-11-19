package chuong2.bai12;

import java.util.Scanner;

public class XepLoaiSV {
    public static void main(String[] args) {
        System.out.println("Nhap diem thi");
        Scanner sc=new Scanner(System.in);
        int i;
        do {
            i=sc.nextInt();
        } while (i>100 || i<0);
        if (i<50) System.out.println("F");
        else if (i>=50 && i<70) System.out.println("D");
        else if (i>=70 && i<80) System.out.println("C");
        else if (i>=80 && i<90) System.out.println("B");
        else System.out.println("A"); 
        sc.close();
    }
}
