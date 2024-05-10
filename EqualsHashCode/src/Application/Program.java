package Application;

import Entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "mmaria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c2));

        System.out.println();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode()); //nessa comparação o resultado é true, pois não existe
                                          //um "new String" para tratar o objeto

        System.out.println();
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);

        scanner.close();
    }
}
