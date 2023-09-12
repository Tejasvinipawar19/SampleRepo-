package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HrmSteps
{
	WebDriver driver; 
	@Given("Open hrm application")
	public void open_hrm_application() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter set of {string} and set of {string}")
	public void user_enter_set_of_and_set_of(String un, String psw)
	{
	    driver.findElement(By.name("username")).sendKeys(un);
	    driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
	   driver.findElement(By.className("oxd-button")).click(); 
	}

	@Then("as per data validation user should be able to login")
	public void as_per_data_validation_user_should_be_able_to_login() 
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login fail");
	    System.out.println("Login completed");
	}



}
