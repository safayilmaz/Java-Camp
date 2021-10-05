package dataAccess.abstracts;

import entities.concretes.Product;

import java.util.ArrayList;

public interface IProductDao {

    void add (Product product);
    void delete (Product product);
    void update (Product product);
    Product get (int id);
    ArrayList<Product> getAll();

}
