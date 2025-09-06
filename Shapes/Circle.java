package Shapes;

public class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void getArea()
    {
        double area = Math.floor(Math.PI * radius * radius * 100.0) / 100.0;
        System.out.println("Area: " + area);
    }

    @Override
    public void draw()
    {
        System.out.println("Circle: ");
        System.out.println("       ***       ");
        System.out.println("    **     **    ");
        System.out.println("  *           *  ");
        System.out.println("  *           *  ");
        System.out.println("    **     **    ");
        System.out.println("       ***       ");
        System.out.println();
    }

    @Override
    public void getName()
    {
        System.out.println("Circle");
    }

    @Override
    public void describeProperties()
    {
        System.out.println("Circles have 0 sides.");
    }
}