package chuong3.bai7;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super(RADIUS);
    }
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent){
        this.radius *= 0.01*percent;
    }
}
