package Application;

import Entities.Product;
import Util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //Using the class UpperCaseName to implements Function

        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //Using a method static in the Product class

        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        //Using a method non static in the Product class

        //Function<Product, String> function = product -> product.getName().toUpperCase();
        //List<String> names = list.stream().map(function).collect(Collectors.toList());
        //Using a declared lambda expression

        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
        //Using a lambda expression in line

        names.forEach(System.out::println);

        scanner.close();
    }
}