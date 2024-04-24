package Application;

import Entities.HotelSystem;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many room will be rented?  ");
        int rooms = sc.nextInt();
        HotelSystem[] vect = new HotelSystem[10];

        for (int i = 0; i < rooms; i++) {
            System.out.println();
            System.out.printf("Rent #%d:%n", i + 1);
            System.out.print("Name:  ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:  ");
            String email = sc.nextLine();
            System.out.print("Room:  ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new HotelSystem(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
