package stepdefinations;

import BaseClass.Basetest;
import Pages.LoginPage;
import io.cucumber.java.en.Then;

public class FlipkartLoginpageSteps{
	@Then("Navigate to the login Feild and enter Continue button")
	public void navigate_to_the_login_feild_and_enter_continue_button() {
	   LoginPage login = new LoginPage(Basetest.driver);
	   login.login("6201129470");
	   login.Click_continue();
	}
}
