package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/waits.xhtml");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		//Clickability
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		clickableElement.click();
		
		//Thread.sleep(10000);
		//Visibility
		WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		boolean displayed = visibleElement.isDisplayed();
		System.out.println(displayed);
		
	}

}
