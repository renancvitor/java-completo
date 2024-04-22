package Program;

import Entites.BankOperation;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankOperation bankOp;

        System.out.print("Enter account number:  ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder:  ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?  ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value:  ");
            double initialDeposit = sc.nextDouble();
            bankOp = new BankOperation(name, accountNumber, initialDeposit);
        }
        else {
            bankOp = new BankOperation(name, accountNumber);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bankOp);

        System.out.println();
        System.out.print("Enter a deposit value:  ");
        double depositValue = sc.nextDouble();
        bankOp.deposit(depositValue);
        System.out.println("Updated Account data:");
        System.out.println(bankOp);

        System.out.println();
        System.out.print("Enter a withdraw value:  ");
        double withdrawValue = sc.nextDouble();
        bankOp.withdraw(withdrawValue);
        System.out.println("Updated Account data:");
        System.out.println(bankOp);

        sc.close();
    }
}
