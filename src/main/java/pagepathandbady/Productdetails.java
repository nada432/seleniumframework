package pagepathandbady;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productdetails extends Pagebase {

	public Productdetails(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css="h1.c-page-title")
	public WebElement productnamebraedcrumb;

}
