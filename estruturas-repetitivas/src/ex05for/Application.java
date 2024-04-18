package ex05for;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Qual fatorial você deseja calcular?  ");
        x = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= x; i++) {
            fatorial = fatorial *  i;
        }

        System.out.println("Fatorial:  " + fatorial);

        sc.close();
    }
}
