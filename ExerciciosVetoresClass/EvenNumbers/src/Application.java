import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will to type?  ");
        int numbers = sc.nextInt();
        int[] vect = new int[numbers];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Type a number:  ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Even Numbers:");

        int evenQuantity = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);
                evenQuantity++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.print("Even quantity:  " + evenQuantity);
        System.out.println();

        sc.close();
    }
}

