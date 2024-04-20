package ProgramEx03;

import EntitiesEx03.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationEx03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Enter the student name:  ");
        aluno.nome = sc.nextLine();
        System.out.println("Enter the three grades of this student:");
        aluno.grade1 = sc.nextDouble();
        aluno.grade2 = sc.nextDouble();
        aluno.grade3 = sc.nextDouble();

        System.out.println();
        System.out.println("FInal grade:  " + String.format("%.2f", aluno.finalGrade()));
        if (aluno.finalGrade() < 60.0) {
            System.out.println("Failed..");
            System.out.println("Missing " + String.format("%.2f", aluno.missiongPoints()) + " points.");
        }
        else {
            System.out.println("Pass!!");
        }

        sc.close();
    }
}
