package business.concretes;

import business.abstracts.IProductService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.IProductDao;
import entities.concretes.Product;
import jLogger.jLoggerManager;

import java.util.List;

public class ProductManager implements IProductService {

    private IProductDao productDao;
    private LoggerService jLoggerManager ;

    public ProductManager(IProductDao productDao, LoggerService jLoggerManager) {
        this.productDao = productDao;
        this.jLoggerManager = jLoggerManager;
    }

    @Override
    public void add(Product product) {
        System.out.println(product.getName());
        this.jLoggerManager.logToSystem("Eklendi" + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
