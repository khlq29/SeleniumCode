package objectRepositoryPages;

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
	
	
}
