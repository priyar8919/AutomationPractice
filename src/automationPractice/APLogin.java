package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APLogin {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		//String baseURL = "http://automationpractice.com/index.php";
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\libs\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("search_query")).sendKeys("Shirt");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.quit();
		

	}

}