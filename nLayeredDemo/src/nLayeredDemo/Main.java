package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataaccess.concretes.HibernateProductDao;
import nLayeredDemo.entitites.concretes.Product;

public class Main {

	public static void main(String[] args) {

		
		ProductService productS = new ProductManager(new HibernateProductDao());
		Product product = new Product();
		product.setCategoryId(2);
		product.setName("Elma");
		
		productS.add(product);
		
	}

}
