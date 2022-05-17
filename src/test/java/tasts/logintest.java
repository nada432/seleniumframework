package tasts;

import org.testng.annotations.Test;

import pages.Changepassword;
import pages.Homepage;
import pages.Loginpage;

public class logintest extends tastbase {
	
	
	Loginpage userloginobject;
	Homepage homeobject ;
	Changepassword   changepassswordobject ;
	
	String username="nada1869";
	String password="dodhnor";
	String oldpassword= password ;
	String newpassword="dodhnor18";
	
	
	 @Test
	public void usercanlogin () {
	
	
		 homeobject =new Homepage (driver);
		 homeobject.userlogin(driver);
		 userloginobject=new Loginpage(driver);
		 userloginobject.usercanlogin( username,password) ;
		 

	}
	 @Test 
	 public void canchangepassword() {
		 changepassswordobject= new Changepassword(driver);
		 changepassswordobject.clickmyaccount(driver);
		 changepassswordobject.usercanchangepassword(oldpassword, newpassword);
		 
	 }
		 
}

