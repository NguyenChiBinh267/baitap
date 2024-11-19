package chuong3.bai8;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[5];
        for (int i=0; i<arr.length; i++) {
            if (i%2==0) {
                arr[i] = new Rectangle("Xanh", i+1, i+2);
            } else {
                arr[i] = new Triangle("Do", i+1, i+2);
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i].toString() + "  " + arr[i].getArea());
        }
    }
}
