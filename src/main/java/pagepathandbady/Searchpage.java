package pagepathandbady;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends Pagebase{

	public Searchpage(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(name="search")
	WebElement searchtextbox;
	@FindBy(css = "ul.react-autosuggest__suggestions-list")
	WebElement productlist;
	@FindBy (xpath="//*[@id=\"hits\"]/div/div[3]/article/div[1]/div/h2/a/div/span")
	WebElement prodectdetails;
	
	public void Searchtext(String searchtext) {
		sendtext(searchtextbox, searchtext);
		
	}
		public void searchproductusingautosuggest() {

		dropdown(productlist, 0);
	}
		public void prodectbtn() {
			clickbtn(prodectdetails);
		}

	
}
