package chuong2.bai23;

import java.util.Scanner;

public class TinhXepDiem {
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
        int maxDiem=a[0];
        for (int i=0; i<n; i++) {
            if(a[i]>maxDiem) maxDiem=a[i];
        }
        System.out.println("Diem cao nhat= " + maxDiem);
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[j]<a[i]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++) System.out.print(a[i] + " ");
        sc.close();
    }
}
