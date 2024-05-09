package Application;

import Entities.Contract;
import Entities.Installment;
import Services.ContractService;
import Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data:");
        System.out.print("Number:  ");
        int number = scanner.nextInt();
        System.out.print("Date (dd/mm/yyyy):  ");
        LocalDate date = LocalDate.parse(scanner.next(), dtf);
        System.out.println("Contract value:  $ ");
        double totalValue = scanner.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Enter the number of installments:  ");
        int n = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, n);

        System.out.println("Installments:");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
