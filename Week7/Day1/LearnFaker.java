package week7.day1;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
	Faker fakeAction=new Faker();
	String firstName = fakeAction.name().firstName();
   System.out.println(firstName);	
   
   
   //LastName
   String lastName = fakeAction.name().lastName();
   System.out.println(lastName);
   
   String emailAddress = fakeAction.internet().emailAddress();
System.out.println(emailAddress);
	}

}

//Karoline
//Altenwerth
//

//Palmira
//Mercedez