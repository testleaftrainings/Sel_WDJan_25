package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathInCreateLeadFunctionality {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Enter username
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Demosalesmanager");
		//Enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click create lead
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		

	}

}
