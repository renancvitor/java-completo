package Application;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import DAO.DaoFactory;
import DAO.SellerDAO;
import Entities.Department;
import Entities.Seller;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
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
	}
}
