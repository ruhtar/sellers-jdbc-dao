package model.dao;

import db.DB;
import model.dao.impl.SellerDAOJDBC;
import model.entities.Seller;

public class DaoFactory {
    //Factory serve apenas serve para instanciar um DAO
    public static SellerDAO createSellerDAO(){
        return new SellerDAOJDBC(DB.getConnection());
    }

}
