package shapes.interfacedesign;

import shapes.interfaces.Describable;

/**
 * Represents a rectangle shape.
 * Implements Drawable, Calculable, and Describable interfaces.
 */
public class Rectangle implements Drawable, Calculable, Describable {
    private final String color;
    private final String name;
    private final double width;
    private final double height;

    /**
     * Constructs a Rectangle with specified color, name, width, and height.
     * @param color The color of the rectangle
     * @param name The name of the rectangle
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     */
    public Rectangle(String color, String name, double width, double height) {
        this.color = color;
        this.name = name;
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Draws the rectangle (prints details to console).
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle named " + name + " with width " + width + " and height " + height);
    }

    /**
     * Returns a description of the rectangle.
     * @return Description string
     */
    @Override
    public String getDescription() {
        return "Rectangle: " + name + ", Color: " + color + ", Width: " + width + ", Height: " + height;
    }
}
