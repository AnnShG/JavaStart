package ua.com.foxminded.carmanager;

public class Bus extends Car { //it must implement all the methods of Serviceable interface as descendant of the Car class

	public Bus(String name, int yearOfPruduction, int price, int weight, ColourEnum colour) { // constructor
		super(name, yearOfPruduction, price, weight, colour);
	}

	@Override
	public boolean isREadyToService() {
		
		if (distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
