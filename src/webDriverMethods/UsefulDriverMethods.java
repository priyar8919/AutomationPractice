package webDriverMethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulDriverMethods {
	WebDriver driver = new ChromeDriver();
	
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
	public void test() {
		driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]")).click();
		//To get webelement text
		String eleText= driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
		System.out.println("The webelement text is :"+eleText );
		
		
	}

}
