package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkswitchto {
	@Test
	public void opengoogle()
	{
		WebDriver driver=WebDriverManager.firefoxdriver().create();
		driver.get("https://www.google.com");
		WebElement google = driver.findElement(By.id("input"));
		google.click();
		google.sendKeys("testing");
		google.submit();
		WebElement ibm = driver.findElement(By.linkText("https://www.ibm.com/in-en/topics/software-testing"));
		ibm.click();
		
		
	}
	

}
