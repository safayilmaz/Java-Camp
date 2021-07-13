
public class CarManager{
	
	private int id;
	private String carName;
	private int year;
	private String color;
	private double unitPrice;
	private double discount;
	
	//empty constructor
	public CarManager () {
		
	}
	// 
	public CarManager(int id, String carName, int year, String color, double discount, double unitPrice) {
		super();
		this.id = id;
		this.carName = carName;
		this.year = year;
		this.color = color;
		this.unitPrice = unitPrice;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice = this.unitPrice - (this.unitPrice * this.discount / 100) ;
	}
	
}
