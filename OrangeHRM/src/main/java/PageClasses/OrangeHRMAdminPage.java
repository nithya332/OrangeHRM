package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMAdminPage {
	WebDriver driver;
	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement Search;
	
	public OrangeHRMAdminPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
    	//driver.navigate()
	}
	 public WebElement SearchOption() {
	        return Search;
	    }
}
