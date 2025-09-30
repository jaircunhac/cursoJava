package javaCourse.section16.exercise2;

import javaCourse.section16.exercise2.model.entities.Contract;
import javaCourse.section16.exercise2.model.entities.Installment;
import javaCourse.section16.exercise2.model.service.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, n);

        System.out.println("Parcelas:");


        sc.close();
    }
}
