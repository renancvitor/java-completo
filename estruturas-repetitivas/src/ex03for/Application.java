package ex03for;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        double media = 0, soma = 0, numReais;

        System.out.print("Quantos números reais você irá digitar?  ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            numReais = sc.nextDouble();
            soma += numReais;
            media = soma / x;
        }

        System.out.println();
        System.out.println("O valor da média dos números digitados é de:  " + String.format("%.1f", media));

        sc.close();
    }
}
