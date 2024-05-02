package Application;

import Entities.Account;
import Exceptions.BankException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number:  ");
            int number = scanner.nextInt();
            System.out.print("Holder:  ");
            String holder = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Initial balance:  ");
            double balance = scanner.nextDouble();
            System.out.print("Withdraw limit:  ");
            double withdrawLimit = scanner.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw:  ");
            double amount = scanner.nextDouble();

            acc.withdraw(amount);
            System.out.printf("New balance:  $ %.2f%n", acc.getBalance());
        }

        catch (RuntimeException e) {
            System.out.println("Unexpected error ocurred!");
        }
        catch (BankException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
