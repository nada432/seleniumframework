package testsamazone;

import org.testng.annotations.Test;

import pagesamazone.Creationacount;
import pagesamazone.Pagehome;

public class Creatacount extends Testbase {

	
	
	Creationacount creatobject;
   Pagehome homeobject ;
   @Test
   public void usercancreatacount() {
	   
	 homeobject= new Pagehome(driver);
	 homeobject.openrigestrationpage();
	 creatobject = new Creationacount(driver);
	 creatobject.usercreataccount("nada", "moahmed", "N1714@gmail.com", "123456nmn99vhg");
	 
	 
	 
	 
   }

}
