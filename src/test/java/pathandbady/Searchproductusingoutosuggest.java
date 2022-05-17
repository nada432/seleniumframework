package pathandbady;

import org.testng.annotations.Test;

import pagepathandbady.Searchpage;

public class Searchproductusingoutosuggest extends Testbase {
	
	
	
	Searchpage searchobject;
	


@Test
public void usercansearchwithusingoutosuggest() 
{
	searchobject=new Searchpage(driver);
   searchobject.Searchtext( "");
	
	searchobject=new Searchpage(driver);
	searchobject.searchproductusingautosuggest();
	
	
	
}
}
