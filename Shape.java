public abstract class Shape 
{
    private String color;
    private String name;

    public Shape(String color, String name) 
    {
        this.color = color;
        this.name = name;
    }

    public String getColor() 
    {
        return color;
    }

    public String getName() 
    {
        return name;
    }

    public abstract double area();
    public abstract void draw();
}