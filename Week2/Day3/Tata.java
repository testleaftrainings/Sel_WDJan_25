package week2.day3;

public class Tata extends Car {
	
	public void advancedFeature() {
		System.out.println("Advanced feature");

	}

	
	public void sevenSeaterFeature() {
		System.out.println("7 Seater");

	}
	
	public static void main(String[] args) {
		Tata tataOptions=new Tata();
		tataOptions.sevenSeaterFeature();
		tataOptions.absBrakingsystem();
		tataOptions.applyBrake();
	}

}
