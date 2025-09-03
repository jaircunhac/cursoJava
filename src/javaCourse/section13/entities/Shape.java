package javaCourse.section13.entities;

import javaCourse.section13.entities.enums.Color;

public abstract class Shape {
    private Color color;

    public abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
    }
}
