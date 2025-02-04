package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods4 {
	
	public static void main(String[] args) {
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Size of an element
		Dimension size = driver.findElement(By.xpath("//h5[text()='Type your name']")).getSize();
	    System.out.println("The size is: "+size);
	    
	    //Get the background color of an element
	    String cssValue = driver.findElement(By.id("layout-config-button")).getCssValue("background-color");
	    System.out.println(cssValue);
	    
	}

}
