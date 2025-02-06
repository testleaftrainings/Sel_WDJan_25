package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			//Instantiate the Actions Class
			Actions actDD=new Actions(driver);
			
			driver.switchTo().frame(0);
			
			WebElement sourceEle = driver.findElement(By.id("draggable"));
			
			WebElement targetEle = driver.findElement(By.id("droppable"));
			actDD.dragAndDrop(sourceEle, targetEle).perform();
			

	}

}
