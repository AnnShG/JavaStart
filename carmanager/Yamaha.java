package ua.com.foxminded.carmanager;

public class Yamaha extends Motorcycle {

	public Yamaha(String name, int yearOfProduction, int price, int weight, String colourString, String engineType,
			boolean isReadyToDrive) {
		super(name, yearOfProduction, price, weight, colourString, engineType, isReadyToDrive);
	}

	@Override
	public boolean isReadyToService() {
		if (distance > 10000) {
			return true;
		} else {
			return false;
		}
	}
	
}
