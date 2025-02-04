package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranCheckboxValidation {

	public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		boolean selected = driver.findElement(By.xpath("//span[text()='Basic']")).isSelected();
        System.out.println("Check box status is: "+selected);
	}

}
