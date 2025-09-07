package shapes.interfacedesign;

/**
 * Main class to demonstrate usage of shape classes and interfaces.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "MyCircle", 5.0);
        Rectangle rectangle = new Rectangle("Blue", "MyRectangle", 4.0, 6.0);
        Triangle triangle = new Triangle("Green", "MyTriangle", 3.0, 4.0);

        System.out.println(circle.getDescription());
        System.out.println("Circle area: " + circle.getArea());
        circle.draw();
        System.out.println();

        System.out.println(rectangle.getDescription());
        System.out.println("Rectangle area: " + rectangle.getArea());
        rectangle.draw();
        System.out.println();

        System.out.println(triangle.getDescription());
        System.out.println("Triangle area: " + triangle.getArea());
        triangle.draw();
        System.out.println();
    }
}
