package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableFunctions.SeleniumUtility;

public class LoginPage {
  WebDriver driver;
  SeleniumUtility su ;
  
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  su = new SeleniumUtility(driver);
  }
  
  //Enter the number and while login
  @FindBy(xpath="//input[@type='number']")
  WebElement Login;
  public void login(String number){
	 su.insertText(Login, number);
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	    
  }
  
  //clicking on continue button
  @FindBy(xpath="//button[text()='Continue']")
  WebElement Continue_btn;
  public void Click_continue(){
	  su.clickelement(Continue_btn);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 su.TakeScreenshot("login");
  }
}
