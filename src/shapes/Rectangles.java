package shapes;

public class Rectangles {
    protected double length;
    protected double width;

    public Rectangles (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public  double getArea() {
        return length * width;
    }
}
