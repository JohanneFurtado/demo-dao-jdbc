package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = Daofactory.createSellerDao();
		
		sellerDao.deleteById(2);
		System.out.println("Delete completed!");
	}
}
