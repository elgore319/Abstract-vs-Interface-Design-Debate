package shapes.abstractdesign;

import shapes.interfaces.Describable;

/**
 * Abstract base class for geometric shapes.
 * Stores common properties and defines required methods for all shapes.
 */
public abstract class Shape implements Describable {
    /**
     * The color of the shape.
     */
    protected String color;
    /**
     * The name of the shape.
     */
    protected String name;

    /**
     * Constructs a Shape with the specified color and name.
     * @param color The color of the shape
     * @param name The name of the shape
     */
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    /**
     * Calculates and returns the area of the shape.
     * @return The area of the shape
     */
    public abstract double getArea();

    /**
     * Draws the shape (implementation should print details to console or GUI).
     */
    public abstract void draw();

    /**
     * Returns a description of the shape.
     * @return Description string
     */
    public abstract String getDescription();
}
