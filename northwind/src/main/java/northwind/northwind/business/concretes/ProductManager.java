package northwind.northwind.business.concretes;

import northwind.northwind.business.abstracts.ProductService;
import northwind.northwind.dataAccess.abstracts.ProductDao;
import northwind.northwind.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
