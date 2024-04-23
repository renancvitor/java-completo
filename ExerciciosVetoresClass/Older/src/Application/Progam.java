package Application;

import Entities.Data;

import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int biggerPosition = 0;
        int olderValue = 0;

        System.out.print("How many peoples you will be to type?  ");
        int ppls = sc.nextInt();

        Data[] vect = new Data[ppls];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("%d person data:  %n", i + 1);
            System.out.print("Name:  ");
            String name = sc.nextLine();
            System.out.print("Age:  ");
            int age = sc.nextInt();
            vect[i] = new Data(name, age);
        }

        System.out.println();
        System.out.print("Older people:  ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() > olderValue) {
                olderValue = vect[i].getAge();
                biggerPosition = i;
            }
        }

        System.out.println(vect[biggerPosition].getName());

        sc.close();
    }
}
