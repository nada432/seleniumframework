package testsamazone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

public class Testbase {
	 public static WebDriver driver ;
	 @BeforeSuite
	 @org.testng.annotations.Parameters({"browser"})
	 
	 public void  start (@Optional("chrome") String browsername) {
		 if (browsername.equalsIgnoreCase("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();

			 
			
		} else if (browsername.equalsIgnoreCase("iedriver")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			driver =new InternetExplorerDriver();
			

		}else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver ",
					System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
		}
		 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("https://www.noon.com/egypt-en/");
		 
	 }
	 }
	 




