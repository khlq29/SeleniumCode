package objectRepositoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.BaseClass;

public class ResultsPage extends BaseClass {
	
	public ResultsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText ="MSI")
	private WebElement MSIChkBx;

	public WebElement getMSIChkBx() {
		return MSIChkBx;
	}
	
	@FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
	private WebElement LogIn;

	public WebElement getLogIn() {
		return LogIn;
	}
	
	@FindBy(xpath = "//*[@id=\"firmware-model-search\"]")
	private WebElement ClkFirmSrchBar;

	public WebElement getClkFirmSrchBar() {
		return ClkFirmSrchBar;
	}
	
	@FindBy(xpath = "")
	private WebElement ClkChkUpdate;

	public WebElement getClkChkUpdate() {
		return ClkFirmSrchBar;
	}
	
	
	
}
