package JUnitDemo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElements {
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
	public void test() {
		
		driver.get(baseURL);
		//driver.findElement(By.className("login")).click();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Page loaded is "+driver.getCurrentUrl());
		driver.findElement(By.id("email_create")).sendKeys("createmail1@demo.com");
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("Create account page opened");
		
		Boolean Selected = true;
		List<WebElement> radio = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains (@name,'id_gender')]"));
		int radSize = radio.size();
		for(int i=0; i<radSize; i++) {
			
			Selected = radio.get(i).isSelected();
			if(!Selected) {
				radio.get(i).click();
				
			}
			System.out.println("Radio selected");
		}
	}

}
