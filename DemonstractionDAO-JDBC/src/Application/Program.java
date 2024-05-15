package Application;

import java.util.Date;

import DAO.DaoFactory;
import DAO.SellerDAO;
import Entities.Department;
import Entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		SellerDAO sellerDAO = DaoFactory.createSellerDao();

		System.out.println(seller);
	}
}
