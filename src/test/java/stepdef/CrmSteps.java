package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class CrmSteps 
{
	WebDriver driver;
	@Given("Open CRM application")
	public void open_crm_application() 
	{
	   driver=new ChromeDriver();
	   driver.get("https://automationplayground.com/crm/login.html");
	}

	@When("User Enter valid email {string} and valid password {string}")
	public void user_enter_valid_email_and_valid_password(String email, String psw) 
	{
	    driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() 
	{
	   driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() 
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("customers"), "Login fail");
	    System.out.println("Login completed!");
	}

}
