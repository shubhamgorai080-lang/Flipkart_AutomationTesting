package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Basetest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	//open the browser
	 @Before
	   public void setup() {
		   Basetest.driver = new ChromeDriver();
		   Basetest.driver.manage().window().maximize();
		   Basetest.driver.get("https://www.flipkart.com/");
	   }
	   
	 //close the browser
	   @After
	   public void tearup() {
		   if (Basetest.driver != null) {
	            Basetest.driver.quit(); // Closes all tabs, windows, and kills the driver process cleanly
	        }
	   }
}
