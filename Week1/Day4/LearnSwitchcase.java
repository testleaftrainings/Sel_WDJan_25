package week1.day4;

public class LearnSwitchcase {
	
	public static void main(String[] args) {
	
		String browser="Chrome";
		
		switch(browser) {
		case "Edge":
			System.out.println("Edge browser launched");
			break;
		case "Chrome":
			System.out.println("Chrome browser launched");
		    break;
		    
		    default:
		    	System.out.println("IE browser launched");
		}
		
		

	}

}
