package week3.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods1 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To get the title of page
		String titleOfPage = driver.getTitle();
		System.out.println("Title is: "+titleOfPage);
		
		//To get the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url is: "+currentUrl);
		
		
		//To get the html source
		//String pageSource = driver.getPageSource();
		//System.out.println("Page source is: "+pageSource);
		
		//To close the driver.
		  driver.close();

	}

}
