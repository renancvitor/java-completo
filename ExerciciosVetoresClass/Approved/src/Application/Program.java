package Application;

import Entities.Data;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be to type?  ");
        int students = sc.nextInt();

        Data[] vect = new Data[students];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Enter name, first and second grade of the %d student:  %n", i + 1);
            String name = sc.nextLine();
            double firstGrade = sc.nextDouble();
            double secondGrade = sc.nextDouble();
            vect[i] = new Data(name, firstGrade, secondGrade);
        }

        int approved;
        System.out.println();
        System.out.println("Approved Students:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].average() >= 6.0) {
                double belowAvg = vect[i].average();
                approved = i;
                System.out.println(vect[approved].getName());
            }
        }

        sc.close();
    }
}
