package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSearch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Desktopp\\Selenium\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.name("search_query")).sendKeys("Shirt");
		//driver.findElement(By.name("submit_search")).click();
		driver .findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Forgot yo")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.quit();

	}

}
