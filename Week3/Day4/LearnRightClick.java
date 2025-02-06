package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			//Instantiate the Actions Class
			Actions actRight=new Actions(driver);
			
			WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
			actRight.contextClick(rightClickElement).perform();
			
	}

}
