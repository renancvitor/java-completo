package ex01for;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um valor para somar os números ímpares 1 um até X:  ");
        x = sc.nextInt();
        System.out.println();
        System.out.printf("Valores no intervalo até %d:  %n", x);

        for (int i = 1; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            };
        }

        sc.close();
    }
}
