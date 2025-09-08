package shapes.interfacedesign;

import shapes.interfaces.Describable;

/**
 * Represents a triangle shape.
 * Implements Drawable, Calculable, and Describable interfaces.
 */
public class Triangle implements Drawable, Calculable, Describable {
    private final String color;
    private final String name;
    private final double base;
    private final double height;

    /**
     * Constructs a Triangle with specified color, name, base, and height.
     * @param color The color of the triangle
     * @param name The name of the triangle
     * @param base The base of the triangle
     * @param height The height of the triangle
     */
    public Triangle(String color, String name, double base, double height) {
        this.color = color;
        this.name = name;
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     * @return The area of the triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Draws the triangle (prints details to console).
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle named " + name + " with base " + base + " and height " + height);
    }

    /**
     * Returns a description of the triangle.
     * @return Description string
     */
    @Override
    public String getDescription() {
        return "Triangle: " + name + ", Color: " + color + ", Base: " + base + ", Height: " + height;
    }
}
