package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataaccess.abstracts.ProductDao;
import nLayeredDemo.entitites.concretes.Product;

public class ProductManager implements ProductService{
	
	ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {

		if (product.getCategoryId() == 1) {
			System.out.print("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		productDao.add(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
