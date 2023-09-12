package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps 
{
	WebDriver driver;
	@Given("Open amazon application")
	public void open_amazon_application() 
	{
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.amazon.in/");
	}

	@When("User capture title for amazon home page")
	public void user_capture_title_for_amazon_home_page() 
	{
	    System.out.println("Home page title is: "+driver.getTitle());
	}

	@Then("Title should match with amazon home page")
	public void title_should_match_with_amazon_home_page()
	{
	    Assert.assertTrue(driver.getTitle().contains("Shopping"),"Title Matched!");
	    System.out.println("Home page tilte matched!");
	}

	@When("User open Best sellers page")
	public void user_open_best_sellers_page() 
	{
	    driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("User capture best sellers title")
	public void user_capture_best_sellers_title() 
	{
	   System.out.println("Best sellers page tilte: "+driver.getTitle());
	}

	@Then("Title should match with best sellers page")
	public void title_should_match_with_best_sellers_page() 
	{
		Assert.assertTrue(driver.getTitle().contains("popular"),"Title match");
		System.out.println("Title is matched!");
	}

	@When("User open mobiles page")
	public void user_open_mobiles_page() 
	{
	   driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User capture mobiles page title")
	public void user_capture_mobiles_page_title() 
	{
	    System.out.println("Mobiles page title: "+driver.getTitle());
	}

	@Then("Title should match with mobiles page")
	public void title_should_match_with_mobiles_page()
	{
		Assert.assertTrue(driver.getTitle().contains("Mobile"),"Title match");
		System.out.println("Title is matched!");
	}



}
