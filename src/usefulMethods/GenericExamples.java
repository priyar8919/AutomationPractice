package usefulMethods;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericExamples {

	WebDriver driver = new ChromeDriver();
	GenericMethods obj = new GenericMethods(driver);
	
	@Before
	public void setUp() throws Exception {
	
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
			obj.getElement("//a[@class='login']",  "xpath").click();
			System.out.println("Sign in pressed");
			Thread.sleep(5000);
			WebElement ele = obj.getElement("//input[@id='email']", "xpath");
			ele.sendKeys("testmail@demo.com");
			obj.getElement("passwd", "id").sendKeys("Test@123");
			obj.getElement("SubmitLogin", "id").click();
			System.out.println("The page name loaded is :"+driver.getTitle());
			
			List<WebElement> eleList = obj.getElements("//ul[@class='bullet']", "xpath");
			int listSize = eleList.size();
			System.out.println("List size is "+listSize);
			
			System.out.println("Elements are "+ eleList.get(listSize-1).getText());
			
			
			/*for(int size = 0; size<=listSize-1; size++) {
				
			System.out.println("Element at "+listSize+" is "+eleList.get(listSize).getText());

				
			}*/
			
			 for (WebElement webElement : eleList) {
		            String name = webElement.getText();
		            System.out.println(name);
		        }
		
	}

}
