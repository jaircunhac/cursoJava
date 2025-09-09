package javaCourse.section14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramFinally {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Jair\\Desktop\\JairSenac\\test.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        // Will be executed no matter the result of the catch and try block
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block was executed");
        }
    }
}
