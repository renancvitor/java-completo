package Application;

import Entities.Product;
import Util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(product -> product.getPrice() >= 100.0); using lambda over here
        //list.removeIf(new ProductPredicate()); using lambda on class ProductPredicate
        //list.removeIf(Product::staticProductPredicate); using static method on class Product
        //list.removeIf(Product::nonStaticProductPredicate); using non static method on class Product

        double min = 100.0; //it could be typed by an user
        //Predicate<Product> pred = product -> product.getPrice() >= min;
        //list.removeIf(pred); using a declared expression

        list.removeIf(product -> product.getPrice() >= min); //using non declared expression

        for (Product product : list) {
            System.out.println(product);
        }

        scanner.close();
    }
}
