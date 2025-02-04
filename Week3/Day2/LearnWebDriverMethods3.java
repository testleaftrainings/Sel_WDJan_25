package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods3 {

	public static void main(String[] args) {
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String textTyped = driver.findElement(By.id("j_idt88:j_idt91")).getAttribute("value");

		System.out.println("The Text already typed: "+textTyped);
		
		boolean displayed = driver.findElement(By.xpath("//h5[text()='Type your name']")).isDisplayed();
	    System.out.println("Element displayed status: "+displayed);
	
	    
	    //isEnabled - 
	    boolean enabled = driver.findElement(By.id("j_idt88:j_idt91")).isEnabled();
	    System.out.println("Text field status: "+enabled);
	
	    boolean enabled2 = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
	    System.out.println("The text field status is: "+enabled2);
	}
}
