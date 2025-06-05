package javaCourse.section10;

import java.util.Scanner;

public class vetoresMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfNumbers = sc.nextInt();
        double[] vec = new double[numberOfNumbers];

        for (int position = 0; position < numberOfNumbers; position++){
            vec[position] = sc.nextDouble();
        }

        double sum = 0;
        for (int valuesInVector = 0; valuesInVector < numberOfNumbers; valuesInVector++){
            sum += vec[valuesInVector];
        }

        double avg = sum / numberOfNumbers;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}
