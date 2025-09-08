public class Triangle extends Shape implements Calculable, Drawable, Describable
{
    private double base;
    private double height;

    /**
     * Represents a triangle shape with base and height.
     */
    public Triangle(String color, String description, double base, double height) 
    {
        super(color, description);
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     * @return the area
     */
    @Override
    public double area() 
    {
        return 0.5 * base * height;
    }

    /**
     * Draws the triangle by printing its details.
     */
    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + getColor() + " " + getDescription() + " with base " + base + " and height " + height);
    }

    /**
     * Gets the description of the triangle.
     * @return the description
     */
        
    @Override
    public String getDescription() 
    {
        return super.getName();
    }
}