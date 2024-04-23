import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have?  ");
        int values = sc.nextInt();

        int[] vectA = new int[values];
        int[] vectB = new int[values];
        int[] vectC = new int[values];

        System.out.println("Enter the values of vector A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("Resulting vector:");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
