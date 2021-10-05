package dataAccess.concretes;

import dataAccess.abstracts.IProductDao;
import entities.concretes.Product;

import java.util.ArrayList;

public class ProductDao implements IProductDao {


    @Override
    public void add(Product product) {
        System.out.println(product.getName() + " is added");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getName() + " is deleted");

    }

    @Override
    public void update(Product product) {
        System.out.println(product.getName() + " is updated");
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public ArrayList<Product> getAll() {
        return null;
    }
}
