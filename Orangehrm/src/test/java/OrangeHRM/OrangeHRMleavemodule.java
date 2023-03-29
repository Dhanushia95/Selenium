package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrangeHRMleavemodule {
	@Test
	public void login()  {
		
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    WebElement username=driver.findElement(By.name("username"));
	    username.sendKeys("Admin");
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("admin123");
	    WebElement click= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	    click.click();
	    WebElement leave= driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule\']"));
	    leave.click();
	    
	    
	}
	

}
