package stepdefinations;

import BaseClass.Basetest;
import Pages.FlipkartBuynow;
import Pages.FlipkartSearchpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class FlipkartBuynowSteps extends Basetest{
	public class FlipkartBuynowSteps{	
	FlipkartSearchpage fs;

	@Given("Open the flipkart Website through URl")
	public void open_the_flipkart_website_through_u_rl() {
		//setup();
	}
	
	@When("Click on the search bar and write iphone")
	public void click_on_the_search_bar_and_write_iphone() {
		fs=new FlipkartSearchpage(Basetest.driver);
   	   fs.searchprod("iphone 15");
	}
	
	@Then("Click on the first mobile phone and click Buy now Button")
	public void click_on_the_first_mobile_phone_and_click_buy_now_button() {
		FlipkartBuynow fbn = new FlipkartBuynow(Basetest.driver);
	    fbn.BuyProduct();	
	    
	}
}
