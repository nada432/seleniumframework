package pathandbady;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import uttilte.Helper;

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
			driver.navigate().to("https://www.bathandbodyworks.com.eg/en/");
	 }
			
			@AfterMethod
			 public void screenshotonfailure(ITestResult result) {
					if (result.getStatus()==ITestResult.FAILURE) {
						System.out.println("failed");
						System.out.println("taking screenshot ......");
						Helper.caputurescreenshot(driver, result.getName());
						
					}
			
			
		 
	 }
	 }
	 




