package Application;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import DAO.DaoFactory;
import DAO.SellerDAO;
import Entities.Department;
import Entities.Seller;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SellerDAO sellerDAO = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDAO.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDAO.findById(1);
		seller.setName("Martha Wayne");
		sellerDAO.update(seller);
		System.out.println("Update completed!");

		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete test:  ");
		int id = scanner.nextInt();
		sellerDAO.deleteById(id);
		System.out.println("Delete completed");

		scanner.close();
	}
}
