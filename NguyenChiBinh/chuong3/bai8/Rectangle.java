package chuong3.bai8;

public class Rectangle extends Shape {
    protected int length;
    protected int width;
    
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public Rectangle() {
        super();
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }
    @Override
    public String toString() {
        return super.toString() + "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
