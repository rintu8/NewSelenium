package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given(": user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Level1 Pass");
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When(":user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Level2 Pass");
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And(": user clicks login button")
	public void user_clicks_login_button() {
		
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Level3 Pass");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then(": user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Level4 Pass");
	    //throw new io.cucumber.java.PendingException();
	}

}
