package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.pvrcinemas.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			//Instantiate the Actions Class
			Actions actMousehover=new Actions(driver);
			
			//Find the element
			WebElement hoverElement = driver.findElement(By.xpath("//span[text()='More']"));

	        //mouseHovering-moveToElement
			
			actMousehover.moveToElement(hoverElement).perform();
	
	}

}
