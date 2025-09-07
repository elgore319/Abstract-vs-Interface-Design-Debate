package shapes.abstractdesign;

import shapes.interfaces.Describable;

public abstract class Shape implements Describable {
    protected String color;
    protected String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public abstract double getArea();
    public abstract void draw();
    public abstract String getDescription();
}
