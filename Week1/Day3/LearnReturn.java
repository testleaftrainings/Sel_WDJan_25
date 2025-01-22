package week1.day3;

public class LearnReturn {
	
	public int makeCall() {
		
		return 85265;

	}
	
	public String takePhotos() {
		
		return "Jan2025";

	}
	
	
public static void main(String[] args) {
		LearnReturn returnOptions=new LearnReturn();
		//returnOptions.makeCall();
		System.out.println(returnOptions.makeCall());
		System.out.println(returnOptions.takePhotos());
		}   
}
