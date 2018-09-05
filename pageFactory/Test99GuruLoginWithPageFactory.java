package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageFactory.Guru99Homepage;

import pageFactory.Guru99Login;

public class Test99GuruLoginWithPageFactory {

    WebDriver driver;
    Guru99Login objLogin;
    Guru99Homepage objHomePage;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }


    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object
    objLogin = new Guru99Login(driver);
    
    //Verify login page title
    String loginPageTitle = objLogin.getLoginTitle();
    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application
    objLogin.loginToGuru99("mgr123", "mgr!23");

    // go the next page
    objHomePage = new Guru99Homepage(driver);

    //Verify home page
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }

    

}