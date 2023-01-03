package shapes;

public class Square extends Rectangles {
        protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("get perimeter from square class");
        return 4 * side;
    }

    @Override
    public double getArea() {
        System.out.println("get perimeter from rectangle class");
        return Math.pow(side, 2);
    }
}
