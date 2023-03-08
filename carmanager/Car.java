package ua.com.foxminded.carmanager;
// the code style after the class: fields -> constructors -> business methods (that we created) -> service methods -> getters and setters

// car class for description
public abstract class Car implements Serviceable { // we cannot make a new class instance because Car class is abstract, and so constructor cannot be invoked from Car anymore, only from its descendants

	// polya or fields
	String name; // class variables
	int yearOfPruduction;
	int price; // always integer
	int weight;
	ColourEnum colour;
	private int distance = 0; // we cannot call it from other file, e.g. from carManager, is accessible only
								// from this class
	protected int distanceOnService = 0; // is accessible for this class and all its descendants

	// String white = "WHITE";
	// Enum Colour = Enum.valueOf(Colour.class, white);

	public Car(String name, int yearOfPruduction, int price, int weight, ColourEnum colour) { // constructor, it is also a method
		this.name = name; // this - calling the field of the class
		this.yearOfPruduction = yearOfPruduction;
		this.price = price; //
		this.weight = weight;
		this.colour = colour;
	}

	public void addDistance(int additionalDistance) { // it returns nothing and accepts additionalDistance
		// distance = distance + additionalDistance;
		distance += additionalDistance;
		//distanceOnService += additionalDistance;

		class Local {
			void methodInMethod() {
				distanceOnService += additionalDistance;
			}
		}
		new Local().methodInMethod();

		if (additionalDistance < 0) {
			throw new IllegalArgumentException("Discance of the car is less than zero");
		}
	}

	public void addDistance(double additionalDistance) { // it returns nothing and accepts additionalDistance
		// distance = distance + additionalDistance;
		distance += additionalDistance;
		//distanceOnService += additionalDistance;

		class Local {
			void methodInMethod() {
				distanceOnService += additionalDistance;
			}
		}
		new Local().methodInMethod();

		if (additionalDistance < 0) {
			throw new IllegalArgumentException("Discance of the car is less than zero");
		}
	}
	
	public void Service() {
		
		if (distanceOnService > 0) {
			distanceOnService = 0;
		}
	}
	
	public int getDistanceOnService() {
		return distanceOnService;
	}

	// method for access (getter)
	public int getDistance() {
		return distance;
	}
	
	// we regenerated it to get distance in our car
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfPruduction=" + yearOfPruduction + ", price=" + price + ", weight="
				+ weight + ", colour=" + colour + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfPruduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) { // also a method
		if (this == obj) // comparing if objects are the same
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // comparing the classes of these objects, car and car = true, car and
											// motorcycle = false
			return false;
		Car other = (Car) obj; // приводится машина для сравнения
		if (colour != other.colour) // comparing all the fields
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfPruduction != other.yearOfPruduction)
			return false;
		return true;
	}

}
