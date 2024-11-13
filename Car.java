package assignmentjava;

public class Car extends Vehicle {

	int speed;

	Car(String brand, int speed) {
		super(brand); // Call the constructor of the base class
		this.speed = speed;
	}

	void drive() {
		System.out.println(brand + " car is driving at " + speed + " km/h.");

		System.out.println("test Car");
		
		System.out.println("updating java file for git");

	}
}
