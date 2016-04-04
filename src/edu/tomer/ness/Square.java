package edu.tomer.ness;

/**
 * Created by Dev on 04/04/2016.
 */
public class Square extends Shape {
    //Private fields:
    private double width;
    private double height;

    /**
     * Constructor
     * @param color - Shapes color
     * @param width - Square Width
     * @param height - Square Height
     */
    public Square(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
