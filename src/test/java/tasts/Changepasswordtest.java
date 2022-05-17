package tasts;

import org.testng.annotations.Test;

import pages.Changepassword;

public class Changepasswordtest extends tastbase {
	
	Changepassword   changepassswordobject ;
	@Test
	public void userchangepassword() {
		changepassswordobject = new Changepassword(driver);
		changepassswordobject.usercanchangepassword("1234567", "987654321");
	}
	

}
