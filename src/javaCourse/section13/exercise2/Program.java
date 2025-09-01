package javaCourse.section13.exercise2;

import javaCourse.section13.exercise2.entities.ImportedProduct;
import javaCourse.section13.exercise2.entities.Product;
import javaCourse.section13.exercise2.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> listOfProducts = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int amountProducts = sc.nextInt();

        for (int aux = 1; aux<=amountProducts; aux++){
            System.out.println("Product #" + aux + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char c = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (c == 'c'){
                Product product = new Product(name, price);

                listOfProducts.add(product);
            } else if (c == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String data = sc.next();

                Product product = new UsedProduct(name, price, sdf.parse(data));

                listOfProducts.add(product);
            } else if (c == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, fee);

                listOfProducts.add(product);
            } else {
                System.out.println("Invalid answer");
            }
        }

        System.out.println("PRICE TAGS:");

        for (Product product : listOfProducts){
            System.out.println(product.priceTag());
        }
    }
}
