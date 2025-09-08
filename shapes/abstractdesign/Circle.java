package shapes.abstractdesign;

/**
 * Represents a circle shape.
 * Extends the abstract Shape class.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Constructs a Circle with specified color, name, and radius.
     * @param color The color of the circle
     * @param name The name of the circle
     * @param radius The radius of the circle
     */
    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return The area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Draws the circle (prints details to console).
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle named " + name + " with radius " + radius);
    }

    /**
     * Returns a description of the circle.
     * @return Description string
     */
    @Override
    public String getDescription() {
        return "Circle: " + name + ", Color: " + color + ", Radius: " + radius;
    }
}
