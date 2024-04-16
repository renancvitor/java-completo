package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valor;

        System.out.print("Digite um valor:  ");
        valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Par!");
        }
        else {
            System.out.println("Ímpar!");
        }
    }
}
