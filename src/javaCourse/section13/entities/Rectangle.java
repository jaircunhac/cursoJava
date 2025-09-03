package javaCourse.section13.entities;

import javaCourse.section13.entities.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        super();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
