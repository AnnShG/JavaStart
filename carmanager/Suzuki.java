package ua.com.foxminded.carmanager;

public class Suzuki extends Motorcycle {

	public Suzuki(String name, int yearOfProduction, int price, int weight, String colourString, String engineType,
			boolean isReadyToDrive) {
		super(name, yearOfProduction, price, weight, colourString, engineType, isReadyToDrive);
	}

	@Override
	public boolean isReadyToService() {
		if (distance > 8000) {
			return true;
		} else {
			return false;
		}
	}
}
