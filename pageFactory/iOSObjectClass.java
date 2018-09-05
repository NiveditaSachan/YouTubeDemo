package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class iOSObjectClass {
	AppiumDriver driver;	
//	String lemoneyPin="le.money:id/pin_1";
	String lemoneyPin="//XCUIElementTypeApplication[@name=\"Lemoney\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]";
//
//@iOSFindBy(xpath="//XCUIElementTypeApplication[@name=\"Lemoney\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
//@AndroidFindBy(id="le.money:id/pin_1")
//MobileElement lemoneyPin;	
////

public void enterPin(String Pin) {
	driver.findElement(By.xpath(lemoneyPin)).sendKeys(Pin);
//	lemoneyPin.sendKeys(Pin);
}

	
public iOSObjectClass(AppiumDriver driver) {
	this.driver=driver;
//	try {
//	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
//	
//	catch(ExceptionInInitializerError e) {
//		System.out.println("e.toString() : "+ e.toString());
//		System.out.println("e.getCause()getMessage : "+ e.getCause().getMessage());
//
//	}
		
}

}
