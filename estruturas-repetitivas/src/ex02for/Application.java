package ex02for;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int in = 0, out = 0, inteiros, x;

        System.out.print("Quantos números inteiros você vai digitar?  ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            inteiros = sc.nextInt();
            if (inteiros >= 10 && inteiros <= 20) {
                in++;
            }
            else {
                out++;
            }
        }
        System.out.println();

        System.out.println(in + " números dentro do intervalo [10,20]");
        System.out.print(out + " números fora do intervalo [10,20]");
        System.out.println();

        sc.close();
    }
}
