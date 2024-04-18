package ex07for;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Qual você você deseja calculas as potências?  ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println(i);
            System.out.printf("A potência de %d ao quadrado é:  ", i);
            System.out.println(Math.pow(i, 2));
            System.out.printf("A potência de %d ao cubo é:  ", i);
            System.out.println(Math.pow(i, 3));
        }

        sc.close();
    }
}
