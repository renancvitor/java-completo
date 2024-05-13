package Application;

import Entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path:  ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            double avg = list.stream()
                    .map(product -> product.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price:  $ " + String.format("%.2f", avg));

            Comparator<String> comparator = (string1, string2) -> string1.toUpperCase().compareTo(string2.toUpperCase());
            List<String> names = list.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(product -> product.getName())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error:  " + e.getMessage());
        }

        scanner.close();
    }
}
