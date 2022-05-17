
package pathandbady;

import org.testng.annotations.Test;

import pagepathandbady.Loginpage;
import pagepathandbady.Pagehome;
import pagepathandbady.Searchpage;
import pagepathandbady.Writereview;



public class Addreviewtest extends Testbase {
	
		
		Searchpage searchobject;
		Writereview reviewobject;

		Pagehome homeobject;
		Loginpage loginobject;
	
		String productname="in the stars";
		String reviewtitle ="goodreview"; 
		String review ="product is very good";
		String nackname="ali";
		
		
	
	
		


	 @Test (priority = 1)
	 public void  usercanlogin() {
		 homeobject =new Pagehome(driver);
		 homeobject.usersignin();
		 loginobject =new Loginpage(driver);
		 loginobject.userlogin("nm171471@gmail.com", "Nada-12");
		 
	 }
		
	@Test (priority = 2)

	public void usersearchaboutproduct() {
		
		searchobject=new Searchpage(driver);
		searchobject.Searchtext(productname);
		searchobject.prodectbtn();
	}
	@Test(priority = 3)
	
	public void canaddreview() {
		reviewobject=new Writereview(driver);
		reviewobject.usercanaddreview(reviewtitle, review, nackname );
		
		
	}
	

	}

