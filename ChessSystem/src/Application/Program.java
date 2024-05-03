package Application;

import BoardGame.Position;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Position pos = new Position(3, 5);
        System.out.println(pos);

        scanner.close();
    }
}
