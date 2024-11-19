package chuong3.bai7;

public class Circle implements GeometricObject {
    protected static final double RADIUS = 1.0;
    protected double radius;
    public Circle() {
        this.radius = RADIUS;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
