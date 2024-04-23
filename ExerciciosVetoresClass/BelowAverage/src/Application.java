import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you will to type?  ");
        int numbers = sc.nextInt();

        double[] vect = new double[numbers];
        double avg = 0, sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number:  ");
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
            avg = sum / numbers;
        }

        System.out.println();
        System.out.println("Vector average:  " + avg);

        System.out.println("Elements below average:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg) {
                System.out.println(String.format("%.1f", vect[i]));
            }
        }

        sc.close();
    }
}
