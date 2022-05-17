package pagepathandbady;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Pagebase {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (id="edit-name")
	WebElement emailtext;
	@FindBy (id="edit-pass")
	WebElement passwordtext;
	@FindBy(name = "op")
	WebElement submitbtn;
	@FindBy (linkText = "My Account")
	WebElement myaccountbtn;
	
	public void userlogin(String email , String password ) {
		sendtext(emailtext, email);
		sendtext(passwordtext, password);
		clickbtn(submitbtn);
		
	}
	public void myacountpage() {
		clickbtn(myaccountbtn);
	}
	
	
		
	}


