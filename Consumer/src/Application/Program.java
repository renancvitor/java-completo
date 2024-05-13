package Application;

import Entities.Product;
import Util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new PriceUpdate());  using a class with interface Consumer
        //list.forEach(Product::staticPriceUpdate); using reference method static on Product class
        //list.forEach(Product::nonStaticPriceUpdate); using reference method non static on Product class

        double factor = 1.1;  //the value of set price can be typed by the user
//        Consumer<Product> consumer = product -> {
//            product.setPrice(product.getPrice() * factor);  expression lambda
//        };
//        list.forEach(consumer); using expression lambda declared

        list.forEach(product -> product.setPrice(product.getPrice() * factor));

        list.forEach(System.out::println);

        scanner.close();
    }
}