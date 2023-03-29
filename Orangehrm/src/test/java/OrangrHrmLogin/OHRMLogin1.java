package OrangrHrmLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OHRMLogin1 {
	
	public static  void main(String[] args) throws IOException
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().create();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		  File file = new File("C:\\Users\\dell\\Documents\\orangehrmlogindetails1.xlsx");
		  FileInputStream inputstream =new FileInputStream(file);
		  XSSFWorkbook workbook  = new XSSFWorkbook(inputstream);
		  XSSFSheet sheet =workbook.getSheetAt(1);
		  	  
		  int rownum = sheet.getLastRowNum(); 
		  System.out.println("last row:"+rownum);
		  int colnum =sheet.getRow(1).getLastCellNum();
		  System.out.println("column num:"+ colnum);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  for(int i =1; i<=rownum;i++)
		  {
			    XSSFRow row =sheet.getRow(i);
         					  
				  String value =row.getCell(0).getStringCellValue();
				  String value1=row.getCell(1).getStringCellValue();
				 
					 
					  WebElement username =  driver.findElement(By.xpath("//input[@name='username']"));
					  username.clear();
					  username.sendKeys(value); 
					 
					  WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
					  password.clear();
					  password.sendKeys(value1);
					  
					  WebElement login =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']" ));
					  login.click(); 
					  
			  }
			  
			  
			  
		  }	  
		  
		  
		  
	}	  


