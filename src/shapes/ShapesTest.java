package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(5 , 2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());
    }
}