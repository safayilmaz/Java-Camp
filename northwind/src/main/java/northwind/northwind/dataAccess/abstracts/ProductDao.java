package northwind.northwind.dataAccess.abstracts;

import northwind.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {


}
