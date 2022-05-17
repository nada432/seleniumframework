package tasts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Userregistrtion;

public class Userregistrationtast extends tastbase {
	
	Userregistrtion regesterobject ;
	  
	@Test
	public void userragistrationtest() {
   
    regesterobject =new Userregistrtion(driver);
    regesterobject.userregsitration("nada", "mohamed","nm1892@fayoum.edu.eg" , "nada1869","1234567" );
    assertTrue(regesterobject.secessmessage.getText().contains("Almost done! To complete your nopCommerce registration"));
	}

}
