package Program;

import Entities.EmployeeData;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeData> list = new ArrayList<>();

        System.out.print("How many employees will be registred?  ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id:  ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id alredy taken! Try again:  ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name:  ");
            String name = sc.nextLine();
            System.out.print("Salary:  ");
            Double salary = sc.nextDouble();

            EmployeeData emp = new EmployeeData(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase:  ");
        int idSalary = sc.nextInt();

        //EmployeeData emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        Integer pos = position(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage:  ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("\nList of employees:");
        for (EmployeeData emp : list) {
            System.out.println(emp);
        }

//
//        boolean idExists = false;
//        for (EmployeeData emp : list) {
//            if (emp.getId() == idSalary) {
//                System.out.print("Enter the percentage:  ");
//                double percent = sc.nextDouble();
//                emp.increaseSalary(percent);
//                idExists = true;
//            }
//        }
//
//        if (!idExists) {
//            System.out.println("This id does not exist!");
//        }
//
//        System.out.println("\nList of employees:");
//        for (EmployeeData emp : list) {
//            System.out.println(emp);
//        }

        sc.close();
    }

    public static Integer position(List<EmployeeData> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<EmployeeData> list, int id) {
        EmployeeData emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
