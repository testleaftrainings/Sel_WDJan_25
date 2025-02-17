package week5.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//IRetryAnalyser

public class RetryAnalyser implements IRetryAnalyzer {

	//true-It will retry
	//false-It will not retry
	
	
	
	int count=0;
	public boolean retry(ITestResult result) {
		
		if(count<3) {   //   0   1   2
			count++;  
			return true;   
		}
		return false;
		
	}

	
	
	

}
