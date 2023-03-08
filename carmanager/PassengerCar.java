package ua.com.foxminded.carmanager;

// this is a superclass PassengerCar that was inherited from the Car class (so all the fields are inherited too, except of private fields)
public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfPruduction, int price, int weight, ColourEnum colour) {
		super(name, yearOfPruduction, price, weight, colour); // this is a constructor
		
	}

	@Override
	public boolean isREadyToService() {
		
		//return super.isREadyToService(); // refers to a method from the basic class Car
		
		if (distanceOnService > 10000) {
			return true;
		} else {
			return false;
		}
	}

}
