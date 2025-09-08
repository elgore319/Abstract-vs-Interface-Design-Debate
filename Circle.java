/**
 * Represents a circle shape with a radius.
 */
public class Circle extends Shape implements Drawable, Calculable, Describable
{
    private double radius;

     /**
      * Constructs a Circle object.
      * @param color the color of the circle
      * @param name the name/description of the circle
      * @param radius the radius
      */
    public Circle(String color, String name, double radius) 
    {
        super(color, name);
        this.radius = radius;
    }

     /**
      * Calculates the area of the circle.
      * @return the area
      */
    @Override
    public double area() 
    {
        return Math.PI * radius * radius;
    }

     /**
      * Draws the circle by printing its details.
      */
    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + getColor() + " circle named " + getName() + " with radius " + radius);
    }

        /**
        * Gets the description of the circle.
        * @return the description
        */
    @Override
    public String getDescription() 
    {
        return super.getName();
    }

    
}