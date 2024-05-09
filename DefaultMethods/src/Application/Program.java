package Application;

import Services.BrazilInterestService;
import Services.UsalInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Amount:  ");
        double amount = scanner.nextDouble();
        System.out.print("Months:  ");
        int months = scanner.nextInt();

        UsalInterestService is = new UsalInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println("$ " + String.format("%.2f", payment));

        scanner.close();
    }
}
