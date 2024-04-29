package Program;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Marry", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Sarah", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("\n" + "Update!");
        }

        Account acc10 = new Account(1001, "Alex", 1000.0);
        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());

        Account acc11 = new SavingsAccount(1002, "Marry", 1000.0, 0.01);
        acc11.withdraw(200.0);
        System.out.println(acc11.getBalance());

        Account acc20 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc20.withdraw(200.0);
        System.out.println(acc20.getBalance());

        // POLYMORPHISM

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Marry", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
