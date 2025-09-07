package shapes.interfacedesign;

import shapes.interfaces.Describable;

/**
 * Represents a circle shape.
 * Implements Drawable, Calculable, and Describable interfaces.
 */
public class Circle implements Drawable, Calculable, Describable {
    private final String color;
    private final String name;
    private final double radius;

    /**
     * Constructs a Circle with specified color, name, and radius.
     * @param color The color of the circle
     * @param name The name of the circle
     * @param radius The radius of the circle
     */
    public Circle(String color, String name, double radius) {
        this.color = color;
        this.name = name;
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
