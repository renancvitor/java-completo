package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.print("Digite sua senha:  ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida!");
            System.out.println();
            System.out.print("Digite novamente sua senha:  ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta! Acesso liberado.");

        sc.close();
    }
}
