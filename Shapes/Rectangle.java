package Shapes;

public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea()
    {
        double area = length * width;
        System.out.println("Area: " + area);
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle: ");
        System.out.println(  "****************"  );
        System.out.println(  "*              *"  );
        System.out.println(  "*              *"  );
        System.out.println(  "*              *"  );
        System.out.println(  "****************"  );
        System.out.println();
    }

    @Override
    public void getName()
    {
        System.out.println("Rectangle");
    }

    @Override
    public void describeProperties()
    {
        System.out.println("Rectangles have 4 sides,");
    }
}