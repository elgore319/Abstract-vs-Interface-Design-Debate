public class Triangle extends Shape implements Calculable, Drawable, Describable
{
    private double base;
    private double height;

    public Triangle(String color, String description, double base, double height) 
    {
        super(color, description);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() 
    {
        return 0.5 * base * height;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + getColor() + " " + getDescription() + " with base " + base + " and height " + height);
    }

        
    @Override
    public String getDescription() 
    {
        return super.getName();
    }
}