package org.example;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department dp = new Department(1, "opa");
        Seller sl = new Seller(1,"Vendedor", "tutu@gmail", new Date(), 944.49, dp);

        SellerDAO sellerDAO = DaoFactory.createSellerDAO();

        System.out.println(sl);
    }
}