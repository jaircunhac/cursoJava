package javaCourse.section15.exercise1;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the path of a file: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] test = line.split(",");

                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
