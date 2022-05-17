package pagepathandbady;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.pagebase;

public class Contactus extends pagebase {

	public Contactus(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (css="label.option.active-label")
	WebElement preferedcommunication ;
	@FindBy(id="edit-first-name")
	WebElement fristnametext;
	@FindBy(id="edit-last-name")
	WebElement lastnametext;
	@FindBy( id="edit-email")
	WebElement emailtext;
	@FindBy(id="select2-edit-feedback-container")
	WebElement selectfeedback;
	@FindBy (id="edit-message")
	WebElement messsagetext;
	@FindBy(id="recaptcha-anchor")
	WebElement comfirmation;
	@FindBy(id="edit-submit")
	WebElement submit;
	public void contactwebsite(String fristname, String lastname, String email, String message) {

		clickbtn(preferedcommunication);
		sendtext(fristnametext, fristname);
		sendtext(lastnametext, lastname);
		sendtext(emailtext, email);
		dropdown(selectfeedback, 1);
		sendtext(messsagetext, message);
		clickbtn(comfirmation);
		clickbtn(submit);
		
		
		
	}
	}
	
	