package week3.day1;

public class LearnFinalKeyword extends LearnFinal {
	
	public void launchbrowser() {
		super.launchbrowser();
		System.out.println("Chrome");

	}

	public static void main(String[] args) {
		
		LearnFinalKeyword key=new LearnFinalKeyword();
		
		key.launchbrowser();
		
		int number=20;
		number=number+10;
		System.out.println(number);
		
		//final variable
		final int num=7;
		//num=num+1;
		

	}

}
