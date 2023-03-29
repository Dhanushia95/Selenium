package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class Orangehrmloginpage {
	
	public static void main(String[] arg) throws InterruptedException
	
	//public void first()
			{
		        System.setProperty("WebDriver.gecko.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\geckodriver.exe");
		        WebDriver driver =new FirefoxDriver();
		       // driver.get("https://orangehrm.com");
		      //  driver.findElement(By.id("Form_getForm_action_submitForm")).click();
		        
				 
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        Thread.sleep(1000);
		        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		        username.sendKeys("Admin");
		        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		        password.sendKeys("admin123");
		        WebElement click = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		        click.click();
		        
		
			}

}
