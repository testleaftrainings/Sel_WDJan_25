package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearnRelativeLocators {

	public static void main(String[] args) {
		
		        //ChromeBrowser
				ChromeDriver driver=new ChromeDriver();
				
				//EdgeDriver driver=new EdgeDriver();
				
		        //Loading the URL -get
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize the browser
			     driver.manage().window().maximize();
			     
			     driver.findElement(RelativeLocator.with(By.id("username")).toRightOf(By.xpath("//label[text()='Username']"))).sendKeys("Demosalesmanager");
			     
			     


	}

}
