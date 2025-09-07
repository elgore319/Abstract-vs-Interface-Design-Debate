package shapes.abstractdesign;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", "MyCircle", 5.0);
        Shape rectangle = new Rectangle("Blue", "MyRectangle", 4.0, 6.0);
        Shape triangle = new Triangle("Green", "MyTriangle", 3.0, 4.0);

        System.out.println("Circle area: " + circle.getArea());
        circle.draw();
        System.out.println();

        System.out.println("Rectangle area: " + rectangle.getArea());
        rectangle.draw();
        System.out.println();

        System.out.println("Triangle area: " + triangle.getArea());
        triangle.draw();
        System.out.println();
    }
}
