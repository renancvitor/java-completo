package Application;

import Services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values?  ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i ++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }
        System.out.println();

        printService.print();

        System.out.println();
        System.out.println("First: " + printService.first());

        scanner.close();
    }
}
