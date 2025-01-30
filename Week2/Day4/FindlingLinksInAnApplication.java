package week2.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindlingLinksInAnApplication {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//Count the number of links
		int numberOfLinks = allLinks.size();
		System.out.println("Number of Links is: "+numberOfLinks);
		
		//Print the Links
		List<String> allStrings=new ArrayList<String>();
		
		for (int i = 0; i < numberOfLinks; i++) {
			String text = allLinks.get(i).getText();
			allStrings.add(text);
		}
		
		System.out.println(allStrings);
		
}

}
