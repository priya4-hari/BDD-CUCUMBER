package cucumber;

import io.cucumber.java.en.*;

public class cucumberClass {
	@Given("Launch the browser and Application")
	public void launch_the_browser_and_application() {
	    System.out.println("Application Launched");
	}

	@And("Enter an username")
	public void enter_an_username() {
		System.out.println("Username entered");
	}

	@And("Enter password")
	public void enter_password() {
	   System.out.println("Password entered");
	}

	@And("click on Login button")
	public void click_on_login_button() {
	   System.out.println("Click on Login Button");
	}

	@Then("Observe successful login")
	public void observe_successful_login() {
	   System.out.println("Successfully Login");
	}




}
