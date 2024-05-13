package Application;

import Entities.Product;
import Services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();

        System.out.print("Enter an initial character:  ");
        char initial = scanner.next().charAt(0);
        double sum = productService.filteredSum(list, product -> product.getName().charAt(0) == initial);

        System.out.println("Sum = " + String.format("%.2f", sum));

        scanner.close();
    }
}