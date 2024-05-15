package Application;

import java.util.Date;

import DAO.DaoFactory;
import DAO.SellerDAO;
import Entities.Department;
import Entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDAO = DaoFactory.createSellerDao();

		Seller seller = sellerDAO.findById(3);

		System.out.println(seller);
	}
}
