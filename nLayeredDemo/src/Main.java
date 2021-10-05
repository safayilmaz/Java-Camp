import business.abstracts.IProductService;
import business.concretes.ProductManager;
import core.concretes.JLoggerManagerAdapter;
import dataAccess.concretes.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class Main {

    public static void main (String[] args){

        IProductService productService = new ProductManager(new ProductDao(), new JLoggerManagerAdapter());
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("iPhone 13 Pro");
        product1.setUnitPrice(10000);
        productService.add(product1);
    }
}
