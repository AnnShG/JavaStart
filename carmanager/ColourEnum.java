package ua.com.foxminded.carmanager;

public enum ColourEnum {
	// to give values only from this enum
	WHITE("white"), GREEN("green"), BLACK("black"), BLUE("blue"), ORANGE("orange");

	public final String name; // Это поле enum, которое содержит строку

	ColourEnum(String name) { // Это конструктор enum Color
		this.name = name;
	}

}