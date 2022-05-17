package pagesamazone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Pagehome extends pagebase {

	public Pagehome(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="dd_header_signInOrUp")
	WebElement signup ;
	 
	public void openrigestrationpage()
	{
		signup.click();
	}
}

