package week2.day3;

public class Car extends Vehicle {
	
	//Vehicle-Parent
	//Car- Child
	public void absBrakingsystem() {
		System.out.println("ABS brake");

	}
	
	
	public static void main(String[] args) {
		Car carOptions=new Car();
		carOptions.absBrakingsystem();
		carOptions.applyBrake();
	}

}
