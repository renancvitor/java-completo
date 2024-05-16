package Application;

import DAO.DaoFactory;
import DAO.DepartmentDAO;
import Entities.Department;
import Entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDAO.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDAO.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDAO.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDAO.findById(1);
        department.setName("Food");
        departmentDAO.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.print("Enter id for delete test:  ");
        int id = scanner.nextInt();
        departmentDAO.deleteById(id);
        System.out.println("Delete completed");

        scanner.close();
    }
}
