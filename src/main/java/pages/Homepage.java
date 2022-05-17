package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor)driver;

	}
	
	@FindBy (xpath="//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]/span/span")
	
	WebElement image ;

	 public void userlogin (WebDriver driver) {
		 Actions builder = new Actions(driver);
		 
		 builder.moveToElement(image).perform();
		 
		 driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]/ul/li[1]/a")).click();

		
	 }
	 public void opencontactus() {
			scroldwon();
			
	 }
	 

		
	}
	 


