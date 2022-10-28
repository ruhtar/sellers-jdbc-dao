package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDAO  {

    void update(Seller obj);
    void insert(Seller obj);
    Seller findById(Integer id);
    List<Seller> findAll();
    void deleteById(Integer id);
}
