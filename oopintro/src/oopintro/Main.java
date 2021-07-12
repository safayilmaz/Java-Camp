package oopintro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Product newProduct = new Product();
		newProduct.setId(1);
		newProduct.setProductName("iPhone 12 Pro");
		newProduct.setDiscount(3.14);
		newProduct.setUnitPrice(12500);
		System.out.print(newProduct.getUnitPriceAfterDiscount());
		

	}

}
