package javaCourse.section8.exercise1.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return height * width;
    }

    public double perimeter(){
        return (width + height) * 2;
    }

    public double diagonal(){
        return Math.sqrt(width*width + height*height);
    }
}
