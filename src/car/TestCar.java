package car;

public class TestCar {

	public static void main(String[] args) {
		
		Car yourCar = new Car();
		Car myCar = new Car();
		myCar.displayCarMake();
		myCar.getcarName();
		int  myCarPrice = myCar.carPrice; 
		String myCarName = myCar.carName;
		
		//Car yourCar = new Car();
		//yourCar.displaycarOfTheYear();
		Car herCar = new Car("Toyota");
		//System.out.println();// sysout short cut 
		
		
		System.out.println("Price is " + " " +myCarPrice);
		System.out.println("The make of the car is " + " " + myCarName);
		//System.out.println(yourCar.carYear);
		//System.out.println(yourCar.getcarYear());
		//System.out.println(yourCar.displaycarOfTheYear());
		//System.out.println(yourCar.displayCarMake());
		// this means we have to put the same type of the argument , this is not a return type, not a String
		//System.out.println(yourCar.displayCarMake());
		
		

	}

}