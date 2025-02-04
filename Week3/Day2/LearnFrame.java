package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step1:
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		//Additional methods:
		driver.switchTo().defaultContent(); //Switch to main webpage
		driver.switchTo().parentFrame();    //switch to immediate parent frame

	}

}
