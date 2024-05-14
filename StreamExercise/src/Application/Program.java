package Application;

import Entities.Employee;

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
        System.out.print("Enter salary:  ");
        double salary = scanner.nextDouble();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            List<Employee> list =new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            List<String> email = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(employee -> employee.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than $ " + String.format("%.2f", salary) + ":");
            email.forEach(System.out::println);

            System.out.print("Enter an initial of a name:  ");
            char initial = scanner.next().charAt(0);

            double sum = list.stream()
                    .filter(employees -> employees.getName().charAt(0) == initial)
                    .map(employees -> employees.getSalary())
                    .reduce(0.0, (employees, y) -> employees + y);

            System.out.println("Sum of salary from people whose name starts with " + "'" + initial + "':  $ " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error:  " + e.getMessage());
        }

        scanner.close();
    }
}
