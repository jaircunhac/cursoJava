package javaCourse.section8.exercise1;

import javaCourse.section8.exercise1.entities.Rectangle;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Insert the value of the height: ");
        rectangle.height = sc.nextDouble();

        System.out.print("Insert the value of the width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());
    }
}
