package week2.day4;

//Implementation extends SBI implements RBI

public class ImplementationClass extends SBI implements RBI {
	
	@Override
	public void mandatoryKYC() {
	System.out.println("Aadhar");
		
	}

	@Override
	public void depositLimit() {
	System.out.println("20 L");
		
	}

	@Override
	public void houseLoan() {
		System.out.println("100 L");
		
	}
	
	public static void main(String[] args) {
		ImplementationClass impOptions=new ImplementationClass();
		impOptions.houseLoan();
		impOptions.depositLimit();
		impOptions.mandatoryKYC();
		impOptions.goldLoan();
		
	}

}
