package ex04for;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, vl1, vl2;
        double resultado = 0;

        System.out.print("Quantos valores você irá digitar?  ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            vl1 = sc.nextInt();
            vl2 = sc.nextInt();
            if (vl2 == 0) {
                System.out.println("Impossível dividir por ZERO!");
            }
            else {
                resultado = (double) vl1 / vl2;
                System.out.println("Resultado:  " + String.format("%.1f", resultado));
            }
        }

        sc.close();
    }
}
