package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Launch the browser
				//ChromeBrowser
				ChromeDriver driver=new ChromeDriver();
				
				//EdgeDriver driver=new EdgeDriver();
				
		        //Loading the URL -get
				driver.get("https://www.facebook.com/");
				
				//Maximize the browser
			     driver.manage().window().maximize();
			     
			     //Click forgetten password link
			     WebElement forgotElement = driver.findElement(By.linkText("Forgotten password?"));
			     
			     String textOfforgotElement = forgotElement.getText();
			     System.out.println("Text is: "+textOfforgotElement);
			     
			     forgotElement.click();
			     
			     String titleOfpage = driver.getTitle();
			     System.out.println("Title of the page is: "+titleOfpage);
			     
			     Thread.sleep(3000);
			     
			     
			     //To Close the browser
			     driver.close();
			     
			 
			     
			     

	}

}
