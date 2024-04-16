package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo, qtde;
        double valor = 0;

        System.out.print("Digite o código do produto:  ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade que deseja:  ");
        qtde = sc.nextInt();

        if (codigo == 1) {
            valor = 4.00;
        }
        else if (codigo == 2) {
            valor = 4.50;
        } else if (codigo == 3) {
            valor = 5.00;
        }
        else if (codigo == 4) {
            valor = 2.00;
        }
        else {
            valor = 1.50;
        }

        double total = 0;

        total = (double) valor * qtde;
        System.out.println("O valor total da sua compra foi de R$ " + String.format("%.2f", total) + ".");

        sc.close();
    }
}
