package edu.tomer.ness;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    //Color c = Color.BLUE;

	// write your code here
        ArrayList<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if (i%2 == 0)
                shapes.add(new Circle("Orange", i + 1));
            else
                shapes.add(new Square("Red", i+1, i+2));
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("The Radius: " + c.getRadius());
            }
        }

        /*
        if (s instanceof Circle){
            Circle c = (Circle) s;
            System.out.println(c.getRadius());
        }
        */
    }
}
