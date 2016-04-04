package edu.tomer.ness;

public enum Color {
    RED(1), BLUE(2), GREEN(3), ORANGE(4);

    int color;

    Color(int color) {
        this.color = color;
    }

    int getColor(){
        return color;
    }
}
