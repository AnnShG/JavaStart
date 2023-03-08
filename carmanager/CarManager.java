package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) { // we need main to execute the program

		// creating an object from the existing class
		// instance of the car, brackets say us that the any method is called
		
		//Car prius = new Car("Toyota Prius", 15000, 2008, 1200, ColourEnum.GREEN);
		//Car renualt = new Car("Renualt Laguna", 1600, 2000, 9700, ColourEnum.WHITE);
		Car renualt2 = new PassengerCar("Renualt Laguna_2", 1600, 2000, 9700, ColourEnum.WHITE); // the most max class was the Car, so we choose it for our type here
		Car lamba = new Bus("Lamba", 1600, 2000, 9700, ColourEnum.WHITE);
		
		List<Car> cars = new ArrayList<>();
		
		// they are in a collection now
		cars.add(renualt2);
		cars.add(lamba);
		
		System.out.println(cars);
		System.out.println();

		Motorcycle suzuki = new Suzuki("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		Motorcycle yamaha = new Yamaha("Yamaha FZ1", 2007, 9000, 700, "orangE ", "gas", false);

		List<Motorcycle> motorcycles = new ArrayList<>();
		
		motorcycles.add(suzuki);
		motorcycles.add(yamaha);

//		prius.addDistance(1000);
//		prius.addDistance(2000);
//		prius.addDistance(Math.round(20.9));
		lamba.addDistance(8000);
		
		renualt2.addDistance(15000);
		lamba.addDistance(15000);

		yamaha.upDistance(250000);
		yamaha.upDistance(-11.5);
		suzuki.upDistance(250000);
		suzuki.upDistance(11.5);

//		System.out.println(prius);
//		System.out.println(renualt);
		System.out.println(renualt2);
		System.out.println(lamba);
		System.out.println();

		yamaha.destroyEngine();
		suzuki.destroyEngine();
		System.out.println(suzuki);
		System.out.println(yamaha);
		System.out.println();

		suzuki.repairMotorcycle();
		yamaha.repairMotorcycle();
		yamaha.paintMotorcycle();
		System.out.println(suzuki);
		System.out.println(yamaha);
		System.out.println();

//		System.out.println(prius.equals(renualt2));
//		System.out.println(renualt.equals(renualt2));
		System.out.println();
		System.out.println(suzuki.equals(yamaha));
		System.out.println();
		
//		prius.Service();
		lamba.Service();
//		System.out.println(prius);
		System.out.println(lamba);
		System.out.println();
		
		System.out.println(renualt2.isREadyToService());
		System.out.println(lamba.isREadyToService());
		System.out.println();
		System.out.println(yamaha.isReadyToService());
		System.out.println(suzuki.isReadyToService());
		
		System.out.println(motorcycles);
		System.out.println();
		
	}

}
