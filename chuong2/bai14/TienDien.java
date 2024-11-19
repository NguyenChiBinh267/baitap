package chuong2.bai14;

import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        System.out.println("Nhap so dien");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int total=0;
        if(i<=50) total += 1484*i;
        else if(i>50 && i<=100) total += 1484*50 + 1533*(i-50);
        else if(i>100 && i<=200) total += (1484 + 1533)*50 + 1786*(i-100);
        else total += (1484 + 1533 )*50 + 1786*100 + 2242*(i-200);
        System.out.println(total);
        sc.close();
    }
}
