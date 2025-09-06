public class Rectangle extends Shape 
{
    private double width;
    private double height;

    public Rectangle(String color, String name, double width, double height) 
    {
        super(color, name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() 
    {
        return width * height;
    }

    @Override
    public void draw() 
    {
        System.out.println("Drawing a " + getColor() + " rectangle named " + getName() + " with width " + width + " and height " + height);
    }
}