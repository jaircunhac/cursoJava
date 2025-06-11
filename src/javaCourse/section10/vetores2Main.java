package javaCourse.section10;

import javaCourse.section10.entities.Product;

import java.util.Scanner;

public class vetores2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountOfProducts = sc.nextInt();
        Product[] vect = new Product[amountOfProducts];

        // Good practices using the vector.length because it will make you do not depend on another variable

        for (int aux = 0; aux <vect.length; aux++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[aux] = new Product(name, price);
        }

        double sum = 0.0;
        for (int aux = 0; aux < vect.length; aux++){
            sum += vect[aux].getPrice();
        }
        double average = sum/ vect.length;

        System.out.printf("AVERAGE PRICE: %.2f%n", average);

        sc.close();
    }
}
