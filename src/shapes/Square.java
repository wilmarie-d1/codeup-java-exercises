package shapes;

public class Square extends Rectangles {
        protected double side;
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
