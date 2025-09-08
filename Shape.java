/**
 * Abstract base class for all shapes.
 */
public abstract class Shape 
{
    private String color;
    private String name;

     /**
      * Constructs a Shape object.
      * @param color the color of the shape
      * @param name the name/description of the shape
      */
    public Shape(String color, String name) 
    {
        this.color = color;
        this.name = name;
    }

     /**
      * Gets the color of the shape.
      * @return the color
      */
    public String getColor() 
    {
        return color;
    }

     /**
      * Gets the name/description of the shape.
      * @return the name
      */
    public String getName() 
    {
        return name;
    }

     /**
      * Calculates the area of the shape.
      * @return the area
      */
    public abstract double area();
     /**
      * Draws the shape.
      */
    public abstract void draw();
}