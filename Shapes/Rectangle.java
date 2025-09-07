package Shapes;

import Abstractdesign.Shape;
import Interfacedesign.Calculable;
import Interfacedesign.Describable;
import Interfacedesign.Drawable;

public class Rectangle extends Shape implements Drawable, Calculable, Describable
{
    private final double length;
    private final double width;

    public Rectangle(String name, double length, double width, String color)
    {
        this.length = length;
        this.width = width;
        this.color = color;
        this.name = name;
    }

    // Calculates and prints the area of a rectangle.
    @Override
    public void getArea()
    {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Draws a recatngle in astericks.
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

    // Prints the name of the shape.
    @Override
    public void getName()
    {
        System.out.println(name);
    }

    // Prints the description of the shape, numbering the sides and its color.
    @Override
    public void describeProperties()
    {
        System.out.println("This shape has 4 sides and is " + color + ".");
        System.out.println();
    }
}