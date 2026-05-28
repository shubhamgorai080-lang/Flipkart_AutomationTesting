package stepdefinations;

import org.openqa.selenium.Keys;

import BaseClass.Basetest;
import Pages.FlipkartSearchpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class FlipkartSearchsteps extends Basetest{
	public class FlipkartSearchsteps {	
	FlipkartSearchpage sp;
	
	
	@Given("To launch the browser and navigate the url")
	public void to_launch_the_browser_and_navigate_the_url() {
		//
	    
	}

	@When("Click on the search bar and search for {string}")
	public void click_on_the_search_bar_and_search_for(String string) {
		 sp= new FlipkartSearchpage(Basetest.driver);
		   sp.searchprod(string);
	}
	
	
	@Then("Navigate to the search page results for {string}")
	public void navigate_to_the_search_page_results_for(String string) {
		 System.out.println(Basetest.driver.getTitle());
	}

}
