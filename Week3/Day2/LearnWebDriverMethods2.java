package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods2 {

	public static void main(String[] args) {
		//getText
		//getAttribute
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/link.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//getText - To get text from the WebElement
		String textInTheElement = driver.findElement(By.linkText("Go to Dashboard")).getText();
		System.out.println("The text is: "+textInTheElement);
		
		//Get Attribute:
		//To get the original link without clicking the link
		//To get the already typed text in the text field
		
		//To get the original link without clicking
		String linkOfThePage = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
		
		System.out.println("Link of the page is: "+linkOfThePage);
		
		//To get the already typed text in the text field
		
		

	}

}
