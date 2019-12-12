package JUnitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	WebDriver driver = new ChromeDriver();
	String baseURL;
	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		baseURL = "http://demowebshop.tricentis.com/";
		driver.get(baseURL);
		System.out.println("Base URL loaded");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
