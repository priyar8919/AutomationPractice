package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(className="login")
	WebElement signInLink;
	
	public void clickSignin() {
		
		signInLink.click();
	}

}
