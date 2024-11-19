package chuong2.bai24;

import java.util.Scanner;

public class TimKiemDiem {
    public static void main(String[] args) {
        System.out.println("Nhap n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++) {
            do {
                System.out.print("a[" + i + "]=" );
                a[i]=sc.nextInt();
                if (a[i]>100 || a[i]<0) {
                    System.out.println("Diem khong hop le");
                }
            } while (a[i]>100 || a[i]<0);
        }
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[j]<a[i]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Mang da sap xep:");
        for(int i=0; i<n; i++) System.out.print("a[" + i + "]=" + a[i] + "  ");
        System.out.println("\nNhap diem can tim:");
        int f=sc.nextInt();
        int l=0, r=n-1;
        while (l<=r){
            int m = (l+r)/2;
            if(a[m]==f) {
                System.out.println("Sinh vien co diem nay la: a[" + m + "]");
                break;
            }
            else if(a[m]<f) l=m+1;
            else if(a[m]>f) r=m-1; 
            else System.out.println("Khong ton tai");
        }
        sc.close();
    }
}
