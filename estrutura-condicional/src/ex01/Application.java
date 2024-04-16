package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Não negativo!");
        }
        else {
            System.out.println("Negativo!");
        }

        sc.close();
    }
}
