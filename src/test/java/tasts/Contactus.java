package tasts;



import org.testng.annotations.Test;

import pages.Contsctus;
import pages.Homepage;

public class Contactus extends tastbase{
	Homepage homeobject;
	Contsctus contactusobject ;
	String name="nada";
	String email="nm171471@gmail.com";
	 String message="it is notgood";
@Test

public void usercancontactus() {
	homeobject=new Homepage(driver);
homeobject.opencontactus();

contactusobject=new Contsctus(driver);
contactusobject.contactwebsite(name, email, message);
	 
	 
}
}