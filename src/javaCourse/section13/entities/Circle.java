package javaCourse.section13.entities;

import javaCourse.section13.entities.enums.Color;

public class Circle extends Shape{
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
