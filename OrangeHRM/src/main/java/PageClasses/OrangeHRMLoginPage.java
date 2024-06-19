package PageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class OrangeHRMLoginPage {
	
	WebDriver driver;
	 @FindBy(name = "username")
	 WebElement usernamefield;
	 @FindBy(name = "password")
	 WebElement passwordfield;
	 @FindBy(xpath = "//button[@type='submit']")
	 WebElement loginbutton;
	 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	 WebElement forgotpasswordlink;
	 public OrangeHRMLoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	 public WebElement ForgotPasswordLinkButton() {
	     return forgotpasswordlink;
	 }
	 public void Login(String username, String password) {
		    usernamefield.sendKeys(username);
		    passwordfield.sendKeys(password);
		    loginbutton.click();
}
}
