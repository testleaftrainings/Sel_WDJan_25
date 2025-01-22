package week1.day3;

public class LearnAccess1 {
	
   public void depositAmount() {
		System.out.println("Amount deposited");
	}
	
	private void withdrawAmount() {
		System.out.println("XX75");

	}
	
	void knowsAtmPin() {
		System.out.println("1275");
	}
	
	public static void main(String[] args) {
		
		LearnAccess1 bankOptions=new LearnAccess1();
		bankOptions.depositAmount();
		bankOptions.withdrawAmount();

	}

}
