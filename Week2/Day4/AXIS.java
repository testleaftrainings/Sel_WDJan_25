package week2.day4;

public class AXIS implements RBI {

	@Override
	public void mandatoryKYC() {
		System.out.println("DL");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("5 Lakhs");
		
	}
	
	public static void main(String[] args) {
		AXIS axisOptions =new AXIS();
		axisOptions.depositLimit();
		axisOptions.mandatoryKYC();
	}

}
