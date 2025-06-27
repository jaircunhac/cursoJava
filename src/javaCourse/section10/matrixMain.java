package javaCourse.section10;

import java.util.Scanner;

public class matrixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the length of the matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Reading the matrix
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the diagonal
        System.out.println("Main diagonal:");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }

        // Printing the amount of negative numbers

        int negativeNum = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < 0){
                    negativeNum++;
                }
            }
        }

        System.out.println();
        System.out.println("Negative numbers: " + negativeNum);

        sc.close();
    }
}
