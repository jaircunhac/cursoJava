package javaCourse.section8.withPOO;

import javaCourse.section8.withPOO.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class mainJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Insert the value of each side of the X triangle: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insert the value of each side of the Y triangle: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area of the X triangle is: %.4f%n", areaX);
        System.out.printf("Area of the Y triangle is: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("The larger area is the area of the X triangle");
        } else if (areaY > areaX) {
            System.out.println("The larger area is the area of the Y triangle");
        } else {
            System.out.println("The area of the triangles are the same");
        }

        sc.close();
    }
}