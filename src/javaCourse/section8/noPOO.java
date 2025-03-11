package javaCourse.section8;

import java.util.Locale;
import java.util.Scanner;

public class noPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Insert the value of each side of the X triangle: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Insert the value of each side of the Y triangle: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double perimeterX = (xA + xB + xC) / 2;
        double perimeterY = (yA + yB + yC) / 2;

        double areaX = Math.sqrt(perimeterX * (perimeterX - xA) * (perimeterX - xB) * (perimeterX -xC));
        double areaY = Math.sqrt(perimeterY * (perimeterY - yA) * (perimeterY - yB) * (perimeterY -yC));

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
