package javaCourse.section8.exercise2;

import javaCourse.section8.exercise2.entities.Product;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the name of the product: ");
        product.name = sc.next();
        System.out.print("Insert the price of the product: ");
        product.price = sc.nextDouble();
        System.out.print("Insert the amount of product there is in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("--------------------");

        System.out.println("General information: ");
        System.out.println("Name: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Stock: " + product.quantity);
        System.out.println("Value of the stock: " + product.totalValueInStock());

        System.out.println("--------------------");

        System.out.print("How much do you want to add in the stock: ");
        int add = sc.nextInt();
        product.addProducts(add);
        System.out.println("Current stock: " + product.quantity);
        System.out.println("Current value of the stock: " + product.totalValueInStock());

        System.out.println("--------------------");

        System.out.print("How much do you want to remove from the stock: ");
        int remove = sc.nextInt();
        product.removeProducts(remove);
        System.out.println("Current stock: " + product.quantity);
        System.out.println("Current value of the stock: " + product.totalValueInStock());

        sc.close();
    }
}
