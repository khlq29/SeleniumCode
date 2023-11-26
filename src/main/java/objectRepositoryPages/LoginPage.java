package objectRepositoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"ap_email\"]")
	private WebElement EmailBtn;

	public WebElement getEmailBtn() {
		return EmailBtn;
	}
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	private WebElement ContinueBtn;

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	
	//buisness method
	public void clickContinueBtn() {
		getContinueBtn().click();
	}
	
}
