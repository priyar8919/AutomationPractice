package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(className="login")
	WebElement signInLink;

	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	public void clickSignin() {
		signInLink.click();
	}
	
	public void sendSearchText(String searchText) {
		searchBox.sendKeys(searchText);
	}
	
	

}
