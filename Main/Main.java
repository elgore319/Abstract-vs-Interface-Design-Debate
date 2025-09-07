package Main;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Triangle;

public class Main 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle("Rectangle", 10.0, 15.0, "Red");
        Circle circ = new Circle("Circle", 5.0, "Yellow");
        Triangle tria = new Triangle("Triangle", 12.0, 6.0, "Blue");

        // Using all the methods to test if they will even work.

        rect.getName();
        circ.getName();
        tria.getName();

        System.out.println();

        rect.getArea();
        circ.getArea();
        tria.getArea();

        System.out.println();

        rect.draw();
        rect.describeProperties();

        circ.draw();
        circ.describeProperties();

        tria.draw();
        tria.describeProperties();
    }
}
