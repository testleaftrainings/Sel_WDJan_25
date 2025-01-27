package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLeadFunctionality {

	public static void main(String[] args) {
		//Step1: Launch the browser
		//ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
		
		//EdgeDriver driver=new EdgeDriver();
		
        //Loading the URL -get
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	     
	     //sendKeys - To enter data in text field
	     //Enter the username  -findElement
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     
	     
	     //Enter the password
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     //Click on the login button
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     //Click on the CRMSFA link
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     //Click on the Leads
	     driver.findElement(By.linkText("Leads")).click();
	     
	     //Click on the CreateLead
	     driver.findElement(By.linkText("Create Lead")).click();
	     
	     }

}
