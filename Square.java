public class Square implements Calculable, Describable, Drawable 
{
    private String color;
    private String name;
    private double side;

    public Square(String color, String name, double side) 
    {
        this.color = color;
        this.name = name;
        this.side = side;
    }

    public String getColor() 
    {
        return color;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public double area() 
    {
        return side * side;
    }
}