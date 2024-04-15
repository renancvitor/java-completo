import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double a, b;

    System.out.println("Digite dois números para fazer a soma:");
    a = sc.nextDouble();
    b = sc.nextDouble();

    System.out.print("Soma:  " + String.format("%.2f", a + b));

    sc.close();

    }
}
