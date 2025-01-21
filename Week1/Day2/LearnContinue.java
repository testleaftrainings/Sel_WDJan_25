package week1.day2;

public class LearnContinue {

	//Continue - will skips the current iteration alone and executed for the remaining
	//If a getting a number 5, that iteration should not be executed
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
