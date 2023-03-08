package ua.com.foxminded.carmanager;

public abstract class Motorcycle implements ServiceableMotor {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	ColourEnum colour;
	String engineType;
	boolean isReadyToDrive;
	protected  int distance = 0;

	public Motorcycle(String name, int yearOfProduction, int price, int weight, String colourString, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;

		colourString = colourString.replace(" ", ""); // вырезаем пробелы и сохраняем полученый результат в ту же самую
														// переменную
		colourString = colourString.toUpperCase(); // делаем все буквы большими и сохраняяем полученный результат в ту
													// же самую
		// переменную
//		 colour = colour.substring(0, 1).toUpperCase();

		// from the string to enum
		/*
		 * Метод valueOf() принимает строку, заходит в enum Colour и проверяет есть ли в
		 * enum Colour такая константа. Если есть, возвращает нам эту константу, если
		 * нет выкидывает ошибку Как пример: Colour.valueOf("BLACK") вернет нам
		 * константу Colour.BLACK
		 */
		this.colour = ColourEnum.valueOf(colourString);

		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}

	public void destroyEngine() {
		isReadyToDrive = false;
	}

	public void repairMotorcycle() {
		isReadyToDrive = true;
	}

	public void paintMotorcycle() {
		this.colour = ColourEnum.BLACK;
	}

	public void upDistance(int upDistance) {
		distance += upDistance;

		if (distance < 0) {
			throw new IllegalArgumentException("Discance of the car is less than zero");
		}
	}
	
	public void upDistance(double upDistance) {
		distance += Math.round(upDistance);
		
		if (distance < 0) {
			throw new IllegalArgumentException("Discance of the car is less than zero");
		}
	}
	
	public boolean isReadyToService() {
		if (distance > 8000) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", colour=" + colour + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + distance;
		result = prime * result + (isReadyToDrive ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		if (colour != other.colour)
			return false;
		if (distance != other.distance)
			return false;
		if (isReadyToDrive != other.isReadyToDrive)
			return false;
		return true;
	}

}
