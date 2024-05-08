package Application;

import ModelEntities.CarRental;
import ModelEntities.Vehicle;
import ModelServices.BrazilTaxService;
import ModelServices.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Progran {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rent data:");
        System.out.print("Car model:  ");
        String model = scanner.nextLine();
        System.out.print("Removal (dd/mm/yyyy hh:mm):  ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dtf);
        System.out.print("Return (dd/mm/yyyy hh:mm):  ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Enter price per hour:  $ ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Enter price per day:  $ ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println();
        System.out.println("Invoice:");
        System.out.print("Basic payment:  $ " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.print("Tax:  $ " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.print("Total payment:  $ " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        scanner.close();
    }
}
