package application;

import java.util.Date;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = Daofactory.createSellerDao();
		
		Department obj = new Department(1, null);
		
		Seller seller = new Seller(null, "Denis", "denis@gmail.com", new Date(), 3000.0, obj);
		sellerDao.insert(seller);
		System.out.println("Inserted! New id = " + seller.getId());

	}
}
