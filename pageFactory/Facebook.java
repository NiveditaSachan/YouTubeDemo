package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	WebDriver driver;

	@FindBy(id="email")
	WebElement Username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement btnLogin;
	
	public void setUserName(String strUsername) {
		Username.sendKeys(strUsername);
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void Login() {
		btnLogin.click();
	}
	
	public void Login(String username,String password) {
		this.setUserName(username);
		this.setPassword(password);
		this.Login();
	}
	
	public  Facebook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
