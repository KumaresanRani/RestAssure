package mevenTestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WedApp_Testing {

	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Kumaresan123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kumar123");
		driver.findElement(By.xpath("//*[contains(@type,\"submit\")]")).click();
		driver.quit();
		
		
	}
	
	
	
	
}
