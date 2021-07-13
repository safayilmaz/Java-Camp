
public class Main {

	public static void main(String[] args) {

		//Create a new car
		CarManager audi = new CarManager(1, "Audi A5", 2016, "White",3.4,120000.00);
		CarManager ford = new CarManager(2, "Ford Focus", 2018, "White",8.3,100000.00);
		//Create a list of cars
		CarManager[] cars = {
				audi, ford
		};
		
		Car newCar = new Car();
		
		//To do bulk operations (multiple car adding to the ArrayList)
		newCar.addMultipleCar(cars);
		newCar.getPrice(audi);
		newCar.getPrice(ford);

		
	}

}
