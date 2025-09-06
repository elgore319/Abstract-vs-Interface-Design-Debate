package Shapes;

public class Triangle extends Shape
{
    private double height;
    private double width;

    public Triangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea()
    {
        double area = (height * width) / 2;
        System.out.println("Area: " + area);
    }

    @Override
    public void draw()
    {
        System.out.println("Triangle: ");
        System.out.println("          *            ");
        System.out.println("        *   *          ");
        System.out.println("      *       *        ");
        System.out.println("    *           *      ");
        System.out.println("  *  *  * * *  *  *    ");
        System.out.println();
    }

    @Override
    public void getName()
    {
        System.out.println("Triangle");
    }

    @Override
    public void describeProperties()
    {
        System.out.println("Triangles have 3 sides,");
    }

}