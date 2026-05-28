package ReusableFunctions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
  
     public WebDriver driver;

	public SeleniumUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	//Explicit wait time 
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf( element));
	}
	
	//To click the element
	public void clickelement(WebElement element) {
		waitForElement(element);
		element.click();
	}
	
	//Insert text into a element using functions
	public void insertText(WebElement element, String value) {
		waitForElement(element);
		element.sendKeys(value);
		element.sendKeys(Keys.ENTER);
	}
	
	//Implicit wait time
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	//Takes the screenshot of the output
		public void TakeScreenshot(String Filename) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			File src=ts.getScreenshotAs(OutputType.FILE);
			String path = "src/test/resources/Screenshots/" + Filename + ".png";
		    try {
				FileUtils.copyFile(src, new File(path));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
