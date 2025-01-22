package week1.day3;

public class Car {
	
public void applyBrake(int a, int b) {
		
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		Car vehicleOptions=new Car();
		vehicleOptions.applyBrake(50, 20);
		vehicleOptions.applyBrake(100 , 30);

	}

}
