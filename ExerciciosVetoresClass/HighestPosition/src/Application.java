import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will to type?  ");
        int nums = sc.nextInt();

        double[] vect = new double[nums];
        double highestValue = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Type a number:  ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        int highestPosition = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > highestValue) {
                highestValue = vect[i];
                highestPosition = i;
            }
        }

        System.out.println("Highest value:  " + String.format("%.1f", highestValue));
        System.out.println("Position of the highest value:  " + highestPosition);


        sc.close();
    }
}
