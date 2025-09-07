package Shapes;

import Abstractdesign.Shape;
import Interfacedesign.Calculable;
import Interfacedesign.Describable;
import Interfacedesign.Drawable;

public class Triangle extends Shape implements Drawable, Calculable, Describable
{
    private final double height;
    private final double width;

    public Triangle(String name, double height, double width, String color)
    {
        this.height = height;
        this.width = width;
        this.color = color;
        this.name = name;
    }

    // Calculates and prints the area of the Triangle.
    @Override
    public void getArea()
    {
        double area = (height * width) / 2;
        System.out.println("Area of Triangle: " + area);
    }

    // Draws a Triangle in Astericks.
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

    // Prints the shapes name.
    @Override
    public void getName()
    {
        System.out.println(name);
    }

    // Prints the discription of the shape, numbering its side and its color.
    @Override
    public void describeProperties()
    {
        System.out.println("This shape has 3 sides and is " + color + ".");
        System.out.println();
    }

}