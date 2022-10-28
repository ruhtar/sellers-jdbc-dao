package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Main {
    public static void main(String[] args) {


        SellerDAO sellerDAOJDBC = DaoFactory.createSellerDAO();

        System.out.println(" ######### TESTE 1 --- --- seller findById ##########");

        Seller seller = sellerDAOJDBC.findById(3);
        System.out.println(seller);

        DB.closeConnection();
    }
}