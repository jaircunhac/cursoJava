package javaCourse.section13;

import javaCourse.section13.entities.Circle;
import javaCourse.section13.entities.Rectangle;
import javaCourse.section13.entities.Shape;
import javaCourse.section13.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAbstractMethod {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = sc.nextInt();

        for (int aux = 1; aux <= numberOfShapes; aux++){
            System.out.println("Shape #" + aux + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char c = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (c == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);

                shapeList.add(shape);
            } else if (c == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);

                shapeList.add(shape);
            } else {
                System.out.println("Invalid answer");
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapeList){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
