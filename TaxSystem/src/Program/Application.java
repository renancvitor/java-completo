package Program;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers:  ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)?  ");
            char payer = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name:  ");
            String name = scanner.nextLine();
            System.out.print("Anual income:  ");
            double income = scanner.nextDouble();
            if (payer == 'i') {
                System.out.print("Health expeditures:  ");
                double healthExpeditures = scanner.nextDouble();
                list.add(new Individual(name, income, healthExpeditures));
            }
            else {
                System.out.print("Number of employees:  ");
                int numberOfImployees = scanner.nextInt();
                list.add(new Company(name, income, numberOfImployees));
            }
        }

        System.out.println();
        double sum = 0.0;
        System.out.println("Taxes paid:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.print(tp.getName() + " $ " + String.format("%.2f", tax) + "\n");
            sum += tax;
        }

        System.out.println();
        System.out.print("Total taxes:  $ " + String.format("%.2f", sum) + "\n");
    }
}
