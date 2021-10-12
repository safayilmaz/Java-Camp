package northwind.northwind.dataAccess.abstracts;

import northwind.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductDao extends JpaRepository<Product,Integer> {

    Product getByProductName (String productName);
    Product getByProductNameAndCategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategoryId(String productName, int categoryId);
    List<Product> getByCategoryIdIn(List<Integer> categories);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName =:productName and category=:categoryId")
    List<Product> GetByNameAndCategory(String productName, int categoryId);

    //select * from products where product_name=name and categoryId=id

}
