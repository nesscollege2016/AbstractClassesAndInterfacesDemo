package edu.tomer.ness;

/**
 * Created by Dev on 04/04/2016.
 */
public class Circle extends Shape {
    //Private Variables:
    private double radius;

    /**
     * Constructor
     * @param color The shapes color
     * @param radius The Radius of the circle
     */
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  (radius * radius * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
