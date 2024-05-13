package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //Comparator<Product> comp = (product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());

//                new Comparator<Product>() {
//            @Override
//            public int compare(Product product1, Product product2) {
//                return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//            }
//        };

        //EXPRESSÃO LAMBDA:
        list.sort((product1, product2) -> product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }

        scanner.close();
    }
}
