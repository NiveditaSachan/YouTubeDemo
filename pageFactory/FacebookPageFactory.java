package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookPageFactory {
	Facebook facebook;
	WebDriver driver;
	
	@BeforeTest
	    public void setup(){
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.facebook.com");
	    }
	  

@Test(priority=0)

	public void TestFacebook(){
		facebook=new Facebook(driver);
		facebook.Login("nivedita123", "1234");
  
		}


}
