public class Main
{
    public static  void main(String[] args)
    {
        Circle circle = new Circle("Blue", "Circle", 5);
        Rectangle rectangle = new Rectangle("Red", "Rectangle", 8, 20);
        System.out.println(circle.area());
        System.out.println(rectangle.area());
        circle.draw();
        rectangle.draw();

    }

}