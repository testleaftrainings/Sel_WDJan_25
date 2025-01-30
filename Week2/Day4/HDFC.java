package week2.day4;

public class HDFC implements RBI {

	@Override
	public void mandatoryKYC() {
		System.out.println("Pan card");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("1 Lakh");
		
	}
	
	public static void main(String[] args) {
		HDFC hdfcOptions=new HDFC();
		hdfcOptions.depositLimit();
		hdfcOptions.mandatoryKYC();
	}

}
