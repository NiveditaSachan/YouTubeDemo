package pageFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.testng.annotations.*;

public class iOSDriverPageFactory {
	
	AppiumDriver driver;
	iOSObjectClass iosObject;
	
	@BeforeTest
	    public void setup() throws MalformedURLException{
		DesiredCapabilities d=new DesiredCapabilities();

		d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
		d.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		d.setCapability(MobileCapabilityType.UDID, "d6f2e45764244f64b18a49da5d14c81657ca2fb1");
		d.setCapability("xcodeOrgId", "5C79GLKU9M");
		d.setCapability("xcodeSigningId", "iPhone Developer");
		d.setCapability(MobileCapabilityType.APP, "/Users/nivedita/Library/Developer/Xcode/DerivedData/Lemoney-ebodsqvvscsaifhbdyrvsdzotwdw/Build/Products/Debug-iphoneos/Lemoney-debug.app");
		d.setCapability(MobileCapabilityType.NO_RESET, "true");
		d.setCapability(MobileCapabilityType.FULL_RESET, "false");
		
		driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),d);
		
		
		File appDir = new File("src");
	     File app = new File(appDir, "app-debug.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability("appPackage", "le.money");
		cap.setCapability("appActivity", "le.money.project.ui.activity.splash.SplashActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
	//	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iosObject = new iOSObjectClass(driver);
	    }
	
	@Test
	public void Test() throws InterruptedException {
		iosObject=new iOSObjectClass(driver);
	Thread.sleep(5000);	
		iosObject.enterPin("1234");		
	}

}
