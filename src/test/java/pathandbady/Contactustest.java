package pathandbady;

import org.testng.annotations.Test;

import pagepathandbady.Contactus;
import pagepathandbady.Pagehome;


public class Contactustest extends Testbase {
	Pagehome homeobject;
	Contactus contactusobject ;
	String fristname="nada";
	 String lastname="Mohamed";
	 String email="nm171471@gmail.com";
	 String message="it is notgood";
	
@Test

 public void usercancontactus() {
	homeobject=new Pagehome(driver);
homeobject.opencontactus();
	
	 contactusobject=new Contactus(driver);
	 contactusobject.contactwebsite(fristname, lastname, email, message);
	 
	 
 }
 }
