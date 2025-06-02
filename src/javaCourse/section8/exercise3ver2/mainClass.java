package javaCourse.section8.exercise3ver2;

import javaCourse.section8.exercise3ver2.entities.Student;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Insert the name of the student: ");
        student.nome = sc.next();

        System.out.print("Insert the grade of the first trimester of the student: ");
        student.nota1Tri = sc.nextInt();
        System.out.print("Insert the grade of the second trimester of the student: ");
        student.nota2Tri = sc.nextInt();
        System.out.print("Insert the grade of the third trimester of the student: ");
        student.nota3Tri = sc.nextInt();

        student.calcMediaAluno(student.nota1Tri, student.nota2Tri, student.nota3Tri);

        student.calcPontosFaltantes();

        System.out.println(student.nome);

        if(student.media > 60){
            System.out.println("PASS");
        } else if(student.media < 60){
            System.out.println("FAILED");
            System.out.print("MISSING " + student.missingPoints + " POINTS");
        } else{
            System.out.println("INVALID VALUES");
        }

        sc.close();
    }
}
