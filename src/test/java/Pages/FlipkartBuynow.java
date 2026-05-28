package Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ReusableFunctions.SeleniumUtility;

public class FlipkartBuynow {
	WebDriver driver;
	SeleniumUtility su;
	
	public FlipkartBuynow(WebDriver driver) {
		this.driver=driver;
		su = new SeleniumUtility(driver);
		PageFactory.initElements( driver,this);
	}
	
	//Switch the window and click on buynow product
	@FindBy(xpath="(//a[contains(@href,'/p/')])[1]")
	WebElement Product;
	
	public void BuyProduct() {
		String parentWindow = driver.getWindowHandle();
		su.clickelement(Product);
		
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		       wait.until(d -> ((org.openqa.selenium.JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
				WebElement Buynow = driver.findElement(By.xpath("//div[text()='Buy now']"));
				su.clickelement(Buynow);
				su.TakeScreenshot("buynowBtn");
			}
		}
	}
}
