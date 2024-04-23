import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will to type?  ");
        int values = sc.nextInt();

        int[] vect = new int[values];
        double avgEven, sumEven = 0, countEven = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number:  ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                sumEven += vect[i];
                countEven++;
            }
        }

        if (countEven == 0) {
            System.out.println("No even number!");
        }
        else {
            avgEven = sumEven / countEven;
            System.out.println("Average even numbers:  " + String.format("%.0f", avgEven));
        }

        sc.close();
    }
}
