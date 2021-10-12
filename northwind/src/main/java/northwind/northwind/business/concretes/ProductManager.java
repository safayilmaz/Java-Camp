package northwind.northwind.business.concretes;

import northwind.northwind.business.abstracts.ProductService;
import northwind.northwind.core.utilities.results.DataResult;
import northwind.northwind.core.utilities.results.Result;
import northwind.northwind.core.utilities.results.SuccessDataResult;
import northwind.northwind.core.utilities.results.SuccessResult;
import northwind.northwind.dataAccess.abstracts.ProductDao;
import northwind.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }
    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>
         (this.productDao.findAll(),"The data is listed");
    }
    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult(true, "The product has been added.");
    }

    @Override
    public DataResult getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productDao.getByProductName(productName));
    }

    @Override
    public DataResult getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategoryId(productName, categoryId));
    }

    @Override
    public DataResult<Product> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategoryId(productName,categoryId));
    }

    @Override
    public DataResult<Product> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIdIn(categories));
    }

    @Override
    public DataResult<Product> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName));
    }

    @Override
    public DataResult<Product> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName));
    }

    @Override
    public DataResult<Product> GetByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.GetByNameAndCategory(productName,categoryId));
    }

}
