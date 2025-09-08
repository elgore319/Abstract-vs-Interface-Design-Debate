package shapes.interfacedesign;

/**
 * Main class to demonstrate usage of shape classes and interfaces.
 */
public class Main {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("Choose a shape to create: (1) Circle (2) Rectangle (3) Triangle");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(color, name, radius);
                    System.out.println(circle.getDescription());
                    System.out.println("Circle area: " + circle.getArea());
                    circle.draw();
                }
                case 2 -> {
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(color, name, width, height);
                    System.out.println(rectangle.getDescription());
                    System.out.println("Rectangle area: " + rectangle.getArea());
                    rectangle.draw();
                }
                case 3 -> {
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(color, name, base, height);
                    System.out.println(triangle.getDescription());
                    System.out.println("Triangle area: " + triangle.getArea());
                    triangle.draw();
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
