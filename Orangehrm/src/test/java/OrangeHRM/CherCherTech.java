package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCherTech {
	@Test
	public void dropdown() {
		
		WebDriver driver = WebDriverManager.firefoxdriver().create();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement box =driver.findElement(By.xpath("//select[@id='first']"));
		box.click();
		Select select = new Select(box);
	    select.selectByIndex(2);
	    select.selectByValue("Yahoo");
	    select.selectByVisibleText("Bing");
	    WebElement box1 =driver.findElement(By.id("animals"));
	    Select select1 = new Select(box1);
	    select1.selectByIndex(1);
	    select1.selectByValue("babycat");
	    select1.selectByVisibleText("Avatar");
	    
		
	
	}

}
