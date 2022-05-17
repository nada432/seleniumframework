package pagepathandbady;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Writereview extends Pagebase {

	public Writereview(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy(css="div.closed-review-submit")
	WebElement writereviewbtn;
	@FindBy(xpath="//*[@id=\"rating-error\"]/label[5]")
	WebElement reviewstars;
	@FindBy(id="title")
	WebElement reviewtitletext;
	@FindBy(id="reviewtext")
	WebElement reviewtext;
	@FindBy(id="usernickname")
	WebElement nacknametext;
	@FindBy(xpath="//*[@id=\"rating_Quality-error\"]/label[5]")
	WebElement reviewstars2;
	public void usercanaddreview(String reviewtitle , String review , String nackname) {
		clickbtn(writereviewbtn);
		clickbtn(reviewstars);
		sendtext(reviewtitletext, reviewtitle);
		sendtext(nacknametext, nackname);
		clickbtn(reviewstars2);
		
	}
	}
	


