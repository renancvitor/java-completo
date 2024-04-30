package Program;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products:  ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)?  ");
            char reference = scanner.next().charAt(0);
            System.out.print("Name:  ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price:  ");
            double price = scanner.nextDouble();

            if (reference == 'i') {
                System.out.print("Customs fee:  ");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else if (reference == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY):  ");
                LocalDate nanufactureDate = LocalDate.parse(scanner.next(), dateTimeFormatter);
                list.add(new UsedProduct(name, price, nanufactureDate));
            }
            else {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("Price Tags:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}
