/**
 * Represents a rectangle shape with width and height.
 */
public class Rectangle extends Shape 
{
    private double width;
    private double height;

     /**
      * Constructs a Rectangle object.
      * @param color the color of the rectangle
      * @param name the name/description of the rectangle
      * @param width the width
      * @param height the height
      */
    public Rectangle(String color, String name, double width, double height) 
    {
        super(color, name);
        this.width = width;
        this.height = height;
    }

     /**
      * Calculates the area of the rectangle.
      * @return the area
      */
    @Override
    public double area() 
    {
        return width * height;
    }

     /**
      * Draws the rectangle by printing its details.
      */
    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + getColor() + " rectangle named " + getName() + " with width " + width + " and height " + height);
    }

    
}