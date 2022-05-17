package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Changepassword extends pagebase{

	public Changepassword(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (linkText ="/en/customer/change-password")
	WebElement changepaswordbtnhp ;
	@FindBy (id="OldPassword")
	WebElement oldpasswordtex;
	@FindBy (id="NewPassword")
	WebElement newpasswordtext;
	@FindBy(id="ConfirmNewPassword")
	WebElement comfirmnewpasswordtext;
	@FindBy (xpath = "//*[@id=\"change-password-page\"]/body/div[7]/section/div/div/div/div[3]/div/div/form/div[2]/input")
	WebElement changepasswordbtn;
	
		 public void clickmyaccount (WebDriver driver) {
			WebElement image =driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]/span/span"));	
			 Actions builder = new Actions(driver);
			 builder.moveToElement(image).perform();
			 driver.findElement(By.xpath("//*[@id=\"info-page\"]/body/div[7]/header/nav/ul/li[4]/ul/li[1]")).click();
			
		 }
				public void usercanchangepassword(String oldpassword,String newpassword) {
		clickbtn(changepaswordbtnhp);
		sendtext(oldpasswordtex, oldpassword);
		sendtext(newpasswordtext, newpassword);
		sendtext(comfirmnewpasswordtext, newpassword);
		clickbtn(changepasswordbtn);
	}
	

}
