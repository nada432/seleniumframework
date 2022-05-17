package pagesamazone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creationacount extends pagebase{

	public Creationacount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div/div/div/div[2]/div[1]/h3[2]")
	WebElement createyouracoount;
	@FindBy (id="firstNameInput")
	WebElement fristnametext;
	@FindBy (id="lastNameInput")
	WebElement lastnametext;
	@FindBy (id="emailInput")
	WebElement emailtext;
	@FindBy (id="passwordInput")
	WebElement passtext ;
	@FindBy (id="login-submit")
	WebElement creataccountbtn;
	@FindBy(xpath ="//*[@id=\"__next\"]/div/header/div[1]/div[2]/div[4]/div/button/span/span[2]")
	WebElement btn;
	
	public void usercreataccount (String fristname ,String lastname ,String email, String pass) {
	
		clickbtn(createyouracoount);
		sendtext(fristnametext, fristname);
		sendtext(lastnametext, lastname);
		sendtext(emailtext, email);
		sendtext(passtext, pass);
	clickbtn(creataccountbtn);
	dropdown(btn, 7);
		
		
		
		
		

	}
	}
	





