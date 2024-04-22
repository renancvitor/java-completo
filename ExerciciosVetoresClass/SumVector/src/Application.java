import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("How many numbers you will to type?  ");
        num = sc.nextInt();

        double[] vect = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Type a number:  ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < num; i++) {
            sum += vect[i];
        }

        System.out.println();
        System.out.print("Values:  ");
        for (int i = 0; i < num; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.println();
        System.out.println("Sum:  " + String.format("%.2f", sum));
        double avg = sum / num;
        System.out.println("Average:  " + String.format("%.2f", avg));


    }
}
