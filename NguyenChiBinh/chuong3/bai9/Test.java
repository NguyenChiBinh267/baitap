package chuong3.bai9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so hinh: ");
        n=sc.nextInt();
        Shape[] arr=new Shape[n];
        for (int i=0; i<n; i++) {
            if (i%2==0) {
                arr[i] = new Rectangle("Xanh", i+1, i+2);
            } else {
                arr[i] = new Triangle("Do", i+1, i+2);
            }
        }
        for (int i=0; i<n; i++) {
            if (arr[i] instanceof Rectangle) System.out.println(arr[i].toString());
        }
        sc.close();
    }
}
