package javaCourse.section9.construtores;

import javaCourse.section9.construtores.entities.Product;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the name of the product: ");
        String name = sc.next();
        System.out.print("Insert the price of the product: ");
        double price = sc.nextDouble();
        System.out.print("Insert the amount of product there is in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

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
