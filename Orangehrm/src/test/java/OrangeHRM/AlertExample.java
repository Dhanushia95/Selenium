package OrangeHRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {
	@Test
	public void alert()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement alertbox = driver.findElement(By.xpath("//input[@name='alert']"));
		alertbox.click();
		//Alert alert = new Alert (driver);
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmationbox =driver.findElement(By.xpath("//input[@name='confirmation']"));
		confirmationbox.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//input[@name='prompt']"));
		promptbox.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("hello");
		alert2.accept();
		
		WebElement hoveron = driver.findElement(By.id("sub-menu"));
		Actions action =new Actions(driver);
		action.moveToElement(hoveron).perform();
		WebElement selectbing =driver.findElement(By.id("link2"));
		action.moveToElement(selectbing).perform();
		
		
		

	}

}
