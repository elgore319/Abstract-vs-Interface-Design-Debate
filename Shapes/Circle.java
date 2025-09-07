package Shapes;

import Abstractdesign.Shape;
import Interfacedesign.Calculable;
import Interfacedesign.Describable;
import Interfacedesign.Drawable;

public class Circle extends Shape implements Drawable, Calculable, Describable
{
    private final double radius;

    public Circle(String name, double radius, String color)
    {
        this.radius = radius;
        this.color = color;
        this.name = name;
    }

    // Calculated and prints the Area of a Circle. 
    @Override
    public void getArea()
    {
        double area = Math.floor(Math.PI * radius * radius * 100.0) / 100.0;
        System.out.println("Area of Circle: " + area);
    }

    // Draws a Circle in Astericks
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

    // Prints out the name of the shape.
    @Override
    public void getName()
    {
        System.out.println(name);
    }

    // Gives a discription of the shape, numbering the amount of sides and color.
    @Override
    public void describeProperties()
    {
        System.out.println("This shape has 0 sides and is " + color + ".");
        System.out.println();
    }
}