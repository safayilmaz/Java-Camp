package oopintro;

public class Product {

	private int id;
	private String productName;
	private double unitPrice;
	private String detail;
	private double discount;
	
	public Product () {
		
	}
	
	public Product(int id, String productName, double unitPrice, String detail) {
		super();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
	

	
	
}
