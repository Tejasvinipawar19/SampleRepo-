package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStep 
{
	 WebDriver driver;
	@Given("Open Google Application")
	public void open_google_application() 
	{
	    System.out.println("Google application open!");
	    driver= new ChromeDriver();
	    driver.get("https://www.google.com");
	}

	@When("Capture actual title of the application")
	public void capture_actual_title_of_the_application() 
	{
	    System.out.println("Actual title is captured !");
	    System.out.println(driver.getTitle());
	}

	@Then("Title should be Google")
	public void title_should_be_google() 
	{
	    System.out.println("Title validation is done");
	    Assert.assertTrue(driver.getTitle().contains("Google"),"Title not match");
	    System.out.println("Title matched");
	}

	@When("I enter valid keyword in google search as {string}")
	public void i_enter_valid_keyword_in_google_search_as(String data) 
	{
	    driver.findElement(By.name("q")).sendKeys(data,Keys.ENTER);
	}

	@Then("I should get result for Java")
	public void i_should_get_result_for_java() 
	{
	   Assert.assertTrue(driver.getTitle().contains("Java"), "Test fail");
	   System.out.println("Test Pass");
	}


}
