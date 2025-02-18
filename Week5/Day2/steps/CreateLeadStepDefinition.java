package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {
	
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click on CreateLead link")
	public void click_on_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyname")
	public void enter_the_companyname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}
	@When("Enter the firstname")
	public void enter_the_firstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	}
	@When("Enter the lastname")
	public void enter_the_lastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	}
	@When("Click on Create Lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	   System.out.println("Lead is created");
	}

}
