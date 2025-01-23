package week1.day4;

public class LearnFibbonacciSeries {
	
	//What is a Fibbonacci series
	
	//
	//Every number will be the addition of previous 2 numbers
	//What are the inputs and output
	//inputs -2 numbers , output - series of numbers
	//How many variables, Logic finding
	//input - 2 variables, 1 variable for storing 3rd number
	// 0   1     1     2     3      5
	//0    1     1
	//     1     1     2
	//           1     2      3
	//                 2      3      5
	
	
	public static void main(String[] args) {
		
		int firstNumber=0;
		int secondNumber=1;
		//int thirdNumber;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for (int i = 1; i <=5; i++) {
			int thirdNumber=firstNumber+secondNumber;  // itr=1 0  1  1
			firstNumber=secondNumber;                      
			secondNumber=thirdNumber;
			System.out.println(thirdNumber);
			
			//itr=1     0       1      1     
			           //fn =1    sn=1          
			
			//it2=2             1       1    2 
			                       //fn=1   sn=2
			
			
			
			
		}
		

	}

}
