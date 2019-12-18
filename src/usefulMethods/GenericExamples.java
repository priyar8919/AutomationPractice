package usefulMethods;

import static org.junit.Assert.*;

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
			
		
	}

}
