package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlepageverify {
	@Test
	public void google()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver , 20);
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("open");
			
		}else {
			System.out.println("not open");
		}
		
		WebElement search =driver.findElement(By.id("input"));
		search.sendKeys("mango");
	}

}
