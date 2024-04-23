package Application;

import Entities.Data;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Data data = new Data();

        System.out.print("How many peoples will be to type?  ");
        int quantity = sc.nextInt();
        Data[] vect = new Data[quantity];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("%d person data:  %n", i + 1);
            System.out.print("Name:  ");
            String name = sc.nextLine();
            System.out.print("Height:  ");
            double height = sc.nextDouble();
            System.out.print("Age:  ");
            int age = sc.nextInt();
            vect[i] = new Data(name, height, age);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }
        double avg = sum / vect.length;
        System.out.println();
        System.out.println("Average height:  " + String.format("%.2f", avg));

        double minors = 0.0;
        double totalHeight = 0.0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                minors++;
            }
            totalHeight += vect[i].getHeight();
        }

        double avgHeight = totalHeight / vect.length;
        double minorsPercent = (minors / vect.length) * 100.0;

        System.out.println();
        System.out.printf("Peoples with less than 16 years old:  %.1f %%\n", minorsPercent);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();
    }
}
