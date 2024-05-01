package Program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program..");

    }

    public static void method1() {

        System.out.println("***** METHOD 1 START *****");
        method2();
        System.out.println("***** METHOD 1 END *****");

    }

    public static void method2() {

        System.out.println("***** METHOD 2 START *****");

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split("  ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!!");
            e.printStackTrace();
            scanner.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Input error!!");
        }

        System.out.println("***** METHOD 2 END *****");

        scanner.close();
    }
}
