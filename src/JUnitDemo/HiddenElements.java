package JUnitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
		
		//Before click no element
		boolean presence = driver.findElement(By.className("please-wait")).isDisplayed();
		System.out.println("Is hidden text displayed: "+ presence);
		
		//After click element is present
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		presence = driver.findElement(By.className("please-wait")).isDisplayed();
		System.out.println("Is hidden text displayed: "+ presence);
	}

}
