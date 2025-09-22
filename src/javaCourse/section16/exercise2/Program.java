package javaCourse.section16.exercise2;

import javaCourse.section16.exercise2.model.entities.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        System.out.println("Entre os dados do contrato:");
        try {
            System.out.print("Numero: ");
            int number = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Valor do contrato: ");
            double totalValue = sc.nextDouble();

            Contract contract = new Contract(number, date, totalValue);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
