package northwind.northwind.business.abstracts;

import northwind.northwind.core.utilities.results.DataResult;
import northwind.northwind.core.utilities.results.Result;
import northwind.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll ();
    Result add(Product product);

    DataResult getByProductName (String productName);
    DataResult getByProductNameAndCategoryId(String productName, int categoryId);
    DataResult<Product> getByProductNameOrCategoryId(String productName, int categoryId);
    DataResult<Product> getByCategoryIdIn(List<Integer> categories);
    DataResult<Product> getByProductNameContains(String productName);
    DataResult<Product> getByProductNameStartsWith(String productName);
    DataResult<Product> GetByNameAndCategory(String productName, int categoryId);

}
