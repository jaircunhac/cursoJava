package javaCourse.section10;

import javaCourse.section10.entities.Product;

import java.util.Scanner;

public class vetores2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i <n; i++){
            sc.nextInt();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){

        }

        sc.close();
    }
}
