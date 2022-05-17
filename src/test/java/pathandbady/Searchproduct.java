package pathandbady;

import org.testng.annotations.Test;

import pagepathandbady.Searchpage;

public class Searchproduct extends Testbase{
	
	Searchpage searchobject;
	String productname="in the stars";
	
@Test

public void usersearchaboutproduct() {
	
	searchobject=new Searchpage(driver);
	searchobject.Searchtext(productname);
	searchobject.prodectbtn();
}


}