package pagepathandbady;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagehome extends Pagebase {

	public Pagehome(WebDriver driver) {
		super(driver);
		jes=(JavascriptExecutor)driver;
		
	}
	
	@FindBy(xpath = "//*[@id=\"block-account-menu\"]/ul/li[3]/a")
	WebElement signin ;
	
	public void usersignin () {
		clickbtn(signin);
 

}
	public void opencontactus() {
		scroldwon();
	}
}