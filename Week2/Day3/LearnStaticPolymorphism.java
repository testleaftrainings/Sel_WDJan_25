package week2.day3;

public class LearnStaticPolymorphism {
	
	//Calculation functionality  -add/sub/mul/div/mod
	//Addition Function
	
	//Add 3 whole numbers
	public void addNumbers(int a, int b, int c) {
		
     System.out.println(a+b+c);
	}
	
	//Add 2 whole numbers
	public void addNumbers(int a, int b) {
		
		System.out.println(a+b);

	}
	
	//1 float and 1 int
	public void addNumbers(int a, float b) {
		System.out.println(a+b);

	}
	
	
    public void addNumbers(float a, float b) {
	System.out.println(a+b);

	}
	
	
	public static void main(String[] args) {
		LearnStaticPolymorphism poly=new LearnStaticPolymorphism();
		poly.addNumbers(10, 30);
		poly.addNumbers(10, 20, 30);
		poly.addNumbers(1.5f, 2.5f);
		poly.addNumbers(1, 2.4f);
	}

}
