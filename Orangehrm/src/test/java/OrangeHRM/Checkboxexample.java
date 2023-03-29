package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Checkboxexample {
	@Test
	public void checkbox()
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().create();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.xpath("//input[@class='Automation']")).click();
		driver.findElement(By.xpath("//input[@class='Performance']")).click();
	}

}
