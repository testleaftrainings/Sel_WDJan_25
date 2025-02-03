package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		//To click the element
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Step1: Transfer the driver focus to Alert box
		Alert simpleAlert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		//Ste2: Handling the Alert
		simpleAlert.accept();
	}
}
