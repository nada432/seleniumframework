package pagepathandbady;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Changepassword extends Pagebase{

	public Changepassword(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(className = "my-account-change-password")
	WebElement changepasswordbtn;
	@FindBy(id="edit-current-pass")
	WebElement currentpasstext;
	@FindBy(id="edit-pass")
	WebElement newpasstext; 
	@FindBy (name="op")
	WebElement changepassbtn;
	
	
	
	public void usercanchangepass(String oldpassword ,String newpassword) {
		clickbtn(changepasswordbtn);
		sendtext(currentpasstext, newpassword);
		sendtext(newpasstext, newpassword);
		clickbtn(changepassbtn);
		
		
	}

}
