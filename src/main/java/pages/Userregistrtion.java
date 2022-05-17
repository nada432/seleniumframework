package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Userregistrtion extends pagebase {

	public Userregistrtion( WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="FirstName")
	WebElement fristname ;
	
	@FindBy(id="LastName")
	WebElement lastname ;
	
	@FindBy (id="Email")
	WebElement email;
	
	@FindBy (id="ConfirmEmail")
	WebElement ConfirmEmail ;
	
	@FindBy (id="Username")
	WebElement Username ;
	
	@FindBy(id="Password")
	WebElement passwordtxt;
	
	@FindBy (id="ConfirmPassword")
	WebElement ConfirmPasswordtxt ;
	
	@FindBy (id="Details_CompanyIndustryId")
	WebElement DetailsComp ;
	
	
	
	@FindBy (id="register-button")
	WebElement registerbut ;
	
	public @FindBy (xpath = "//*[@id=\"2-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div/h2")
	WebElement secessmessage ;
	
	public void userregsitration(String Fristname , String Lastname , String Email , String username ,String password ) {
		sendtext(fristname, Fristname);
		sendtext(lastname, Lastname);
		sendtext(email, Email);
		sendtext(ConfirmEmail, Email);;
		sendtext(Username, username);;
		sendtext(passwordtxt, password);
		sendtext(ConfirmPasswordtxt, password);
	   dropdown(DetailsComp, 4);
       clickbtn(registerbut);
	
	
	
		
		
		
		
	}
	
	
			

}
