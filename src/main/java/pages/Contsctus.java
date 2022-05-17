package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contsctus extends pagebase{

	public Contsctus(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText = "Contact us")
	WebElement contactus;
	@FindBy(id="Type")
   WebElement requesttype;
	@FindBy(id="FullName")
	WebElement nametext;
	@FindBy(id="Email")
	WebElement emailtext;
	@FindBy(id="Enquiry")
	WebElement messagetext;
	@FindBy(css="input.btn.blue-button")
	WebElement submit;
	 public void contactwebsite(String name, String email,String message) {
		 clickbtn(contactus);
		 dropdown(requesttype, 1);
		 sendtext(nametext, name);
		 sendtext(emailtext, email);
		 sendtext(messagetext, message);
		 clickbtn(submit);

	
	
	
	
	 }	
}
