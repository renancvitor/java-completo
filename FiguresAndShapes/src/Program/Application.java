package Program;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import EntitiesEnum.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes:  ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or cicle (r/c)?  ");
            char shape = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Color (BLACK/BLUE/RED):  ");
            Color color = Color.valueOf(scanner.next());
            if (shape == 'r') {
                System.out.print("Width:  ");
                double width = scanner.nextDouble();
                System.out.print("Height  ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Radius:  ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape Areas:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        scanner.close();
    }
}
