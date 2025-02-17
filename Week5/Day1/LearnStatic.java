package week5.day1;

public class LearnStatic {
	
	static int number =7;
	
	
	public void method1() {
		System.out.println("Method1");
		method2();
	}
	
	public static void method2() {
		System.out.println("Method2");
	}
	
	{
		System.out.println("Normal block");
	}
	
	
	static {
		System.out.println("Static block");
		method2();
	
		
	}
	
      public static void main(String[] args) {
    	  System.out.println(number);
		method2();
		

	}

}
