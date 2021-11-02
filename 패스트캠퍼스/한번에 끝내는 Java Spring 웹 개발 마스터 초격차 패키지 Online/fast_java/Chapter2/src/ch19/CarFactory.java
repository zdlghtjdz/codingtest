package ch19;

public class CarFactory {
	
	private static CarFactory carfactory = new CarFactory();
	private static int CarNumber = 10001;
	
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		return carfactory;
	}

	public Car createCar() {
		
		Car car = new Car(CarNumber);
		this.CarNumber++;
		return car;
	}
}
