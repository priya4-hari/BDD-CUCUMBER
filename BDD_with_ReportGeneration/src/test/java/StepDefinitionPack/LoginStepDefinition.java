package StepDefinitionPack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("Launch Browser and an Application")
	public void launch_browser_and_an_application() {
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	    System.out.println("Application Launched successfully!");
	}

	@When("Click on sign in button")
	public void click_on_sign_in_button() {
		driver.findElement(By.linkText("Sign In")).click();
	    System.out.println("Clicked sign in button");
	}

	@And("^Enter username (.*) and password (.*)")
	public void enter_username_j2ee_and_password_j2ee(String FN,String pwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(FN);
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	    System.out.println("Entered username and password");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	    System.out.println("Click on Login button");
	}

	@And("Validating Home page")
	public void validating_home_page() {
		String s = driver.findElement(By.xpath("//div[@id='WelcomeContent']")).getText();
		Assert.assertTrue(s.contains("ABC"));
	   System.out.println("Validated home page");
	}

	@Then("Click on signout button")
	public void click_on_signout_button() {
		driver.findElement(By.linkText("Sign Out")).click();
	   System.out.println("Clicked on signout button");
	}





}
