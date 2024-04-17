package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int gasolina = 0, alcool = 0, diesel = 0, tipo;

        System.out.println("Avaliação dos produtos do posto de gasolina Ouro Preto");
        System.out.println();
        System.out.println("Digite o código do produto de sua preferência, sendo: " +
                "1. Álcool 2. Gasolina 3. Diesel. E para sair digite 4:");
        tipo = sc.nextInt();

        while (tipo != 4) {
                if (tipo == 1) {
                    gasolina += 1;
                } else if (tipo == 2) {
                    alcool += 1;
                } else if (tipo == 3) {
                    diesel += 1;
                }
                else {
                    System.out.println("Código inválido. Digite novamente o código:");
                }
            tipo = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("Gasolina:  " + gasolina);
        System.out.println("Álcool:  " + alcool);
        System.out.println("Diesel:  " + diesel);

        sc.close();
    }
}
