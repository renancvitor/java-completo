package ApplicationEx01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEx01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will to type?  ");
        int nums = sc.nextInt();
        int[] vect = new int[nums];

        for (int i = 0; i < nums; i++) {
            System.out.print("Type a number:  ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Negative numbers: ");
        int negatives = 0;
        for (int i = 0; i < nums; i++) {
            if (vect[i] < 0) {
                negatives = vect[i];
                System.out.println(negatives);
            }
        }

        sc.close();
    }
}
