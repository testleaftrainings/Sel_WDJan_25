package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnMultipleWindows {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//Number of windows to be opened
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		System.out.println("Completed");

	}

}
