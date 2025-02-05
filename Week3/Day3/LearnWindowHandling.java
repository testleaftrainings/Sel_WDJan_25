package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		    ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.leafground.com/window.xhtml");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Click open button
			driver.findElement(By.xpath("//span[text()='Open']")).click();
			
			//To get the address of current window
			String parentWindowAddress = driver.getWindowHandle();
			System.out.println("Address is: "+parentWindowAddress);
			
			//To get the address of all the opened windows
			Set<String> allWindowAddress = driver.getWindowHandles();
			System.out.println("Windows address is: "+allWindowAddress);
			
			//Empty list
			List<String> allWindows=new ArrayList<String>(allWindowAddress);
			
			//Title
			String titleOfParent = driver.getTitle();
			System.out.println("Parent title is: "+titleOfParent);
			
			//Switch the driver focus to child window
			driver.switchTo().window(allWindows.get(1));
			
			//Title
			String titleOfChild = driver.getTitle();
			System.out.println("Child title is :"+titleOfChild);
			
			//close
			driver.close();
			
			driver.switchTo().window(allWindows.get(0));
			
			String title = driver.getTitle();
			System.out.println(title);
			
	        //quit
			//driver.quit();
			
			

	}

}
