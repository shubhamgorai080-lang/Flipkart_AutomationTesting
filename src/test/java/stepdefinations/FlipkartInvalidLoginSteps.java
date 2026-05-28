package stepdefinations;

import BaseClass.Basetest;
import Pages.LoginPage;
import io.cucumber.java.en.Then;

public class FlipkartInvalidLoginSteps {
	LoginPage login;
	@Then("Navigate to the login Feild and enter invalid Mobile number")
	public void navigate_to_the_login_feild_and_enter_invalid_mobile_number(){
		login=new LoginPage(Basetest.driver);
		login.login("65214789632");
	}
	@Then("click on continue button")
	public void click_on_continue_button() {
	  try {
		  login.Click_continue();
	  }
	  catch(Exception e) {
		  System.out.println("Button not clickable due to invalid number");
	  }
	}
}
