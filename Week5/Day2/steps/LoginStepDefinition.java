package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {
	
	@Given("Launch the browser")
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	
	@Given("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
	    String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
	if(text.contains("Welcome")) {
		System.out.println("It was navigated");
	}
	else {
		System.out.println("It was not navigated");
	}
	
	}
	
	@But("It throws error message")
	public void it_throws_error_message() {
	    System.out.println("It throws error message");
	}

}
