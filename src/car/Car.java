package car;

public class Car {
	int carPrice  = 5000;
	String carName = "Toyota";
	int carYear = 2010;
	
	public Car () {
		
	}
	
	public Car(String carName) {
		this.carName= carName;
		System.out.println(carName);
	}
	public void displayCarMake () {
		System.out.println("This is Toyota Matrix");
		
	}
	public String getcarName() {
		return carName;
	}
	public int getcarYear() {
		return carYear;
	}
	public void displaycarOfTheYear() {

		System.out.println("Year of the car is 2010");
	}

}
