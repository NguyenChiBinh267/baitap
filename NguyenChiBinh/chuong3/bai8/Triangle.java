package chuong3.bai8;

public class Triangle extends Shape {
    protected int base;
    protected int height;
    public Triangle() {
    }
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea() {
        return 0.5*base*height;
    }
    @Override
    public String toString() {
        return super.toString() + "Triangle [base=" + base + ", height=" + height + "]";
    }

    
}
