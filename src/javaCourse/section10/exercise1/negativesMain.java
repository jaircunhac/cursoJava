package javaCourse.section10.exercise1;

import java.util.Scanner;

public class negativesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;

        System.out.print("Quantos números serão digitados? ");
        quantidade = sc.nextInt();

        int[] valor = new int[quantidade];

        for (int value = 0; value < valor.length; value++){
            System.out.print("Informe o número: ");
            valor[value] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int value = 0; value < valor.length; value++){
            if (valor[value] < 0){
                System.out.println(valor[value]);
            }
        }

        sc.close();
    }
}
