package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ReusableFunctions.SeleniumUtility;

public class FlipkartSearchpage {
   WebDriver driver;
   SeleniumUtility su;
   
   public FlipkartSearchpage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver,this); 
	   su=new SeleniumUtility(driver);
   }
   
   //Search the product 
   @FindBy(name = "q")
   WebElement searchbox;
   public void searchprod(String product ) {
	   su.insertText(searchbox, product);
	   searchbox.sendKeys(Keys.ENTER);
	   su.TakeScreenshot("searchproduct");
   }
}
