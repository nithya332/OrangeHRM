package OrangeHRM;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.OrangeHRMAdminPage;
import PageClasses.OrangeHRMHomePage;
import PageClasses.OrangeHRMLoginPage;

public class TestCases extends BaseClass {
	public WebDriver driver;
	OrangeHRMLoginPage LoginPage;
	OrangeHRMHomePage HomePage;
	OrangeHRMAdminPage AdminPage;
	@BeforeMethod
	
	public void initialization() throws Exception {
		
		driver = browserInitialisation("chrome");
		LoginPage=new OrangeHRMLoginPage(driver);
		HomePage = new OrangeHRMHomePage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@Test
	public void ForgotPasswordLinkVerification() {
	    LoginPage.ForgotPasswordLinkButton().click();
	    
	}
	@Test
	public void SearchOptionVerification() {
	    LoginPage.Login("Admin", "admin123");
	    Assert.assertEquals(HomePage.searchTabOption().isDisplayed(), true);
	    Assert.assertEquals(HomePage.adminTabOption().isDisplayed(), true);
	    Assert.assertEquals(HomePage.pimTabOption().isDisplayed(), true);
	    Assert.assertEquals(HomePage.leaveOptionVerification(), true);
	}
	@Test
	public void AdminVerifications()
	{
		LoginPage.Login("Admin", "admin123");
		Assert.assertEquals(AdminPage.SearchOption().isDisplayed(), true);
	}
}
