package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {

	@Test
	public void runLogin() {
ChromeDriver driver=new ChromeDriver();
		
		//EdgeDriver driver=new EdgeDriver();
		
        //Loading the URL -get
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	     
	     //sendKeys - To enter data in text field
	     //Enter the username  -findElement
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     
	     //driver.findElement(By.xpath("//input[@id='username']"))
	     
	     
	     //Enter the password
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     //Click on the login button
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     String expectedTitle="Leaftap - TestLeaf Automation Platform";
	     
	     String actualTitle = driver.getTitle();
	     
	     //Assert.assertEquals(actualTitle, expectedTitle);
	     
			/*
			 * if (expectedTitle.equals(actualTitle)) {
			 * System.out.println("Login is successful"); }
			 * 
			 * else { System.out.println("Login not successful"); }
			 */
	     
	     SoftAssert sAssert=new SoftAssert();
	     
	     sAssert.assertEquals(actualTitle, expectedTitle);
	     
	     //Click on the CRMSFA link
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     sAssert.assertAll();
	}

}
