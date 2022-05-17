package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends pagebase {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	public @FindBy (id="Username")
	WebElement usernamebox ;
	 public @FindBy (id="Password")
	WebElement passwordbox;
	 public @FindBy(xpath = "//*[@id=\"login-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input")
	WebElement loginbtn;
	
	 public void usercanlogin( String usernam ,String password ) {
		 sendtext(usernamebox, usernam);
		 sendtext(passwordbox, password);
		 clickbtn(loginbtn);
	 }
	 }


