package pageClasses;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {

	WebDriver driver;
	String baseURL;
	HomePage hp = new HomePage(driver);
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "http://automationpractice.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		System.out.println("@Test going to be executed");
		hp.clickSignin();
		System.out.println("click");
		hp.sendSearchText("Shirt");
	}

}
