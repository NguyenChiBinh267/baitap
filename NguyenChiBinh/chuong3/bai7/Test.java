package chuong3.bai7;

public class Test {
    public static void main(String[] args) {
        ResizableCircle c = new ResizableCircle();
        c.setRadius(1.0);
        System.out.println(String.format("%.4f", c.getArea()));
        System.out.println(String.format("%.4f", c.getPerimeter()));
        c.resize(70);
        System.out.println(String.format("%.4f", c.getArea()));
        System.out.println(String.format("%.4f", c.getPerimeter()));
        
    }
}
