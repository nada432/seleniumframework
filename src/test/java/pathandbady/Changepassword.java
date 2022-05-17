package pathandbady;


import org.testng.annotations.Test;

import pagepathandbady.Loginpage;
import pagepathandbady.Pagehome;

public class Changepassword extends Testbase {
	Pagehome homeobject;
	Loginpage loginobject;
	pagepathandbady.Changepassword changepassobject;
	String oldpassword="Nada-12";
	String newpassword ="Nada-134";
	



	
@Test
 public void  usercanlogin() {
	 homeobject =new Pagehome(driver);
	 homeobject.usersignin();
	 loginobject =new Loginpage(driver);
	 loginobject.userlogin("nm171471@gmail.com",oldpassword) ;
	 
	 
 }
	 @Test
	 public void changepass() {
		 changepassobject =new pagepathandbady.Changepassword(driver) ;
		 changepassobject.usercanchangepass( oldpassword, newpassword);
		 
	 
 }

}
