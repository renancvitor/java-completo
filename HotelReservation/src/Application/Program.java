package Application;

import Model.Entities.Reservation;
import Model.Exceptions.DomainException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Room number:  ");
            int number = scanner.nextInt();
            System.out.print("Check-in  date (dd/mm/yyyy):  ");
            LocalDate checkIn = LocalDate.parse(scanner.next(), Reservation.dateTimeFormatter);
            System.out.print("Check-out  date (dd/mm/yyyy):  ");
            LocalDate checkOut = LocalDate.parse(scanner.next(), Reservation.dateTimeFormatter);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation:  " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy):  ");
            checkIn = LocalDate.parse(scanner.next(), Reservation.dateTimeFormatter);
            System.out.print("Check-out date (dd/mm/yyyy):  ");
            checkOut = LocalDate.parse(scanner.next(), Reservation.dateTimeFormatter);

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (DateTimeException | DomainException e) {
            System.out.println("Error in reservation:  " + e.getMessage());
        }

        scanner.close();
    }
}
