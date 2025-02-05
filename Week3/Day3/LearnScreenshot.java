package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	    public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Additional step: Finding the element
		  WebElement userNameField = driver.findElement(By.id("username"));
		
		
		//Step1: Take the Screenshot of the element
		File source = userNameField.getScreenshotAs(OutputType.FILE);
		
		//Step2: Setup the path for the file
		File destination=new File("./screenshot/username1.png");
		
		//Step3: save the Screenshot in the folder
         FileUtils.copyFile(source, destination);
         
	}

}
