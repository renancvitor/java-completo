package Program;

import Entites.Employee;
import Entites.Outsourced;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Applicaiton {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.print("\n" + "Enter the number of employees:  ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)?  ");
            char ch = sc.next().charAt(0);
            System.out.print("Name:  ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours:  ");
            int hours = sc.nextInt();
            System.out.print("Value per hours:  ");
            double valuerPerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge:  ");
                double additionalChage = sc.nextDouble();
                Employee emp = new Outsourced(name, hours, valuerPerHour, additionalChage);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, valuerPerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Payments:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
