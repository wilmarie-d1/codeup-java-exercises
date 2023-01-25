package shapes;

class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public Rectangle (double length, double width){
        super(length, width);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
