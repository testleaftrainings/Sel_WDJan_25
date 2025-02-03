package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		promptAlert.sendKeys("Vineeth");
		
		String text = promptAlert.getText();
		System.out.println(text);
		
		promptAlert.accept();
		
	}

}
