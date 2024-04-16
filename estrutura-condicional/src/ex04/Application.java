package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int inicio, fim;
        int duracao = 0;

        System.out.print("Digite a hora inicial do jogo:  ");
        inicio = sc.nextInt();
        System.out.print("Digite a hora final do jogo:  ");
        fim = sc.nextInt();

        if (inicio < fim) {
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - inicio + fim;
        }

        System.out.printf("O jogo durou %d horas.", duracao);

        sc.close();
    }
}
