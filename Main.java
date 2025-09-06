

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Triangle;

public class Main 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(10.0, 15.0);
        Circle circ = new Circle(5.0);
        Triangle tria = new Triangle(12.0, 6.0);

        rect.getArea();
        circ.getArea();
        tria.getArea();

        rect.draw();
        circ.draw();
        tria.draw();
    }
}
