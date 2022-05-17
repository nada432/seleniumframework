package pathandbady;

import org.testng.annotations.Test;

import pagepathandbady.Loginpage;
import pagepathandbady.Pagehome;
import pages.Changepassword;

public class Loginpagetest extends Testbase {
	Pagehome homeobject;
	Loginpage loginobject;
	Changepassword   changepassswordobject ;
	


 @Test
 public void  usercanlogin() {
	 homeobject =new Pagehome(driver);
	 homeobject.usersignin();
	 loginobject =new Loginpage(driver);
	 loginobject.userlogin("nm171471@gmail.com", "Nada-12");
	 
	 
 }
 
	 
	 
 }
 
