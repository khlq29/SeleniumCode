package objectRepositoryPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtils.BaseClass;

public class HomePage extends BaseClass {
	
	//class add as constructor and extend baseclass
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="twotabsearchtextbox")
	private WebElement SearchBar;
	
	public WebElement getSearchBar() {
		return SearchBar;
	}
	
	@FindBy(id ="nav-search-submit-button")
	private WebElement SearchBtn;
	
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	
	@FindBy(xpath = "//textarea[@id='APjFqb']")
	private WebElement GoogleSearchBtn;

	public WebElement getGoogleSearchBtn() {
		return GoogleSearchBtn;
	}
	
	@FindBy(xpath = "//li[@role='presentation']")
	private List<WebElement> AutoSugg;

	public List<WebElement> getAutoSugg() {
		return AutoSugg;
	}
	
	@FindBy(xpath = "/html/body/div[2]/section[1]/div/div/div[1]/div[1]/div[2]/div[1]/a")
	private WebElement FirmwareSrch;

	public WebElement getFirmwareSrch() {
		return FirmwareSrch;
	}
	
}
