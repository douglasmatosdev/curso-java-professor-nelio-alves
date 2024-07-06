package src.application;

import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;
import src.model.entities.Seller;


public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
