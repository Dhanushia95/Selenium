package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	@Test
	public void openflipkart()
	{
	    WebDriverManager.firefoxdriver().create();
		//System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		
	    
		
	}

}
