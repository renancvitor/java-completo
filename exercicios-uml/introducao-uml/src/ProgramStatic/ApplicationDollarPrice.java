package ProgramStatic;

import EntitiesStatic.DollarPrice;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationDollarPrice {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?  ");
        DollarPrice.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?  ");
        DollarPrice.quantityDollar = sc.nextDouble();

        System.out.println("Amount to be paid in reais: R$  " + String.format("%.2f",  DollarPrice.totalReais()));

        sc.close();
    }
}
