package ProgramEx01;

import EntitiesEx01.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("Area:  " + String.format("%.2f", rectangle.area()));
        System.out.println("Perimeter:  " + String.format("%.2f", rectangle.perimeter()));
        System.out.println("Diagonal:  " + String.format("%.2f", rectangle.diagonal()));

        sc.close();
    }

}
