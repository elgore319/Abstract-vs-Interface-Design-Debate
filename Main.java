/**
 * Main class to demonstrate shape objects and their behaviors.
 */
public class Main 
{
    /**
     * Main method to run the shape demonstration.
     * @param args command line arguments
     */
    public static void main(String[] args) 
    {
        Circle circle = new Circle("Red", "Circle", 5);
        Rectangle rectangle = new Rectangle("Blue", "Rectangle", 4, 6);
        Triangle triangle = new Triangle("Green", "Triangle", 6, 10); 
        //Square square = new Square("Yellow", "Square", 4);

        circle.draw();
        System.out.println("Area: " + circle.area());
        System.out.println("Description: " + ((Describable)circle).getDescription());

        rectangle.draw();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Description: " + ((Describable)rectangle).getDescription());

        triangle.draw();
        System.out.println("Area: " + triangle.area());
        System.out.println("Description: " + ((Describable)triangle).getDescription());

       // square.draw();
        //System.out.println("Area: " + square.area());
        //System.out.println("Description: " + ((Describable)square).getDescription());
    }
}