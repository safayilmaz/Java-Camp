
public class Car {

	public void addCartoStock(CarManager Car) {
		System.out.println("The car was added succesfully - " + Car.getCarName());
	}
	
	public void getPrice (CarManager Car)
	{
		System.out.println("The price of the choosen car after the discount: " + Car.getUnitPriceAfterDiscount());
	}
	void addMultipleCar (CarManager[] Cars) {
		
		for(CarManager car: Cars) {
			addCartoStock(car);
		}		
	}
	
}
