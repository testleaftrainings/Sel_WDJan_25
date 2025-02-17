package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod(alwaysRun = true)
	public void preConditions(String browser,String URL, String uName, String pWord) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

	}
	
	
	@AfterMethod(alwaysRun = true)
	public void postConditions() {
		driver.close();

	}

}
