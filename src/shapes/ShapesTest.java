package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangles box1 = new Rectangles(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangles box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
