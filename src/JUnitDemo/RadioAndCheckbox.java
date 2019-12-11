package JUnitDemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {

	WebDriver driver;
	String baseURL;
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
	public void test() throws InterruptedException {
		driver.get(baseURL);
		//driver.findElement(By.className("login")).click();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Page loaded is "+driver.getCurrentUrl());
		driver.findElement(By.id("email_create")).sendKeys("createmail1@demo.com");
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("Create account page opened");
		driver.findElement(By.id("id_gender1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("id_gender2")).click();
		WebElement e1= driver.findElement(By.id("id_gender1"));
		System.out.println("Is Radio button selected? "+e1.isSelected());
		WebElement e2= driver.findElement(By.id("newsletter"));
		e2.click();
		System.out.println("Is Checkbox enabled? "+e2.isEnabled());
		e2.click();
		System.out.println("Radio button enabled? "+e1.isEnabled());
		
		
	}

}
