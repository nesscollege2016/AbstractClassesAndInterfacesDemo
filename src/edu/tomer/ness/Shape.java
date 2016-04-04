package edu.tomer.ness;

/**
 * Created by Dev on 04/04/2016.
 */
public abstract class Shape {
    public Shape(String color) {
        this.color = color;
    }

    private String color;

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String className = getClass().getSimpleName();

        return className + "{" +
                "color='" + color + '\'' +
                "Area: " + getArea()
                +"Perimeter: " + getPerimeter() +'}';
    }
}
