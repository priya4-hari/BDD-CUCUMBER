package TestFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("Launch Browser and an application")
	public void launch_browser_and_an_application() {
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	   System.out.println("Application Launched Successfully!");
	}

	@When("Click on signin Button")
	public void click_on_signin_button() {
		driver.findElement(By.linkText("Sign In")).click();
	    System.out.println("Clicked signin button");
	}

	@And("^Enter the username (.*)$")
	public void enter_the_username_j2ee(String FN) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(FN);
	   System.out.println("Entered Username");
	}

	@And("^Enter the password (.*)$")
	public void enter_the_password_j2ee(String pwd) {
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	   System.out.println("Entered Password");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.name("signon")).click();
	    System.out.println("Clicked Login button");
	}

	@And("validating Home page")
	public void validating_home_page() {
		String s = driver.findElement(By.id("WelcomeContent")).getText();
		Assert.assertTrue(s.contains("ABC"));
	    System.out.println("Validated Login successfully!");
	}

	@Then("Click on signout button")
	public void click_on_signout_button() {
		driver.findElement(By.linkText("Sign Out")).click();
	    System.out.println("Clicked signout ");
	}




}
