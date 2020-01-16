package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(className="login")
	WebElement signInLink;

	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickSignin() {
		signInLink.click();
	}
	
	public void sendSearchText(String searchText) {
		searchBox.sendKeys(searchText);
	}
	
	
	

}
