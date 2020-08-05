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
		
		Seller seller = sellerDao.findById(1);
		seller.setName("Gelson Furtado");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}
}
