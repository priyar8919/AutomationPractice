package JUnitDemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageNavigations {

	WebDriver driver;
	String baseURL, LoginUrl, CurrentUrl;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "http://automationpractice.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Base url loaded");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void test() {
		LoginUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
		driver.navigate().to(LoginUrl);
		System.out.println("Navigated to login");
		driver.navigate().back();
		System.out.println("Baseurl");
		driver.navigate().forward();
		System.out.println("Loginurl");
		driver.navigate().refresh();                     //Refresh1
		System.out.println("Refreshed");
		CurrentUrl= driver.getCurrentUrl();
		System.out.println("CurrentUrl is "+CurrentUrl);
		driver.getCurrentUrl();                         //Refresh 2
		System.out.println("Current url loaded again");
		
		
	}

}
