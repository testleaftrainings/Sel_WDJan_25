package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Step1: Launch the browser
		//ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
		
		//EdgeDriver driver=new EdgeDriver();
		
        //Loading the URL -get
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	 
	  }

}
