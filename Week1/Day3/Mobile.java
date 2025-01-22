package week1.day3;

public class Mobile {
	
   public void makeCall() {
		System.out.println("Make call");
	}
   
   public void takePhotos() {
	   System.out.println("Take HQ photos");
   }
	
	public static void main(String[] args) {
		//ClassName objectName=new ClassName();
		Mobile mobActions=new Mobile();
		mobActions.makeCall();
		mobActions.takePhotos();
	}

}
