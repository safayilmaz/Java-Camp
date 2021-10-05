package northwind.northwind.business.abstracts;

import northwind.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll ();
}
