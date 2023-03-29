package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex2TestNgWebPage {
	
	//public static void main(String[] arg)
	@Test
	public void google()
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dell\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
	}

}
