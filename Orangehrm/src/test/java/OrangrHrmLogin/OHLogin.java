package OrangrHrmLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHLogin {
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
		  for(int i =1; i<=rownum;i++)
		  {
			  Row row =sheet.getRow(i);
			 
		  
		  //import data for username 
		  
		  Cell cell =sheet.getRow(i).getCell(0);
		  String value  =cell.getStringCellValue(); 
		  cell.setCellValue(value);
		 
		  
		  WebElement username =  driver.findElement(By.xpath("//input[@name='username']"));
		  username.clear();
		  username.sendKeys(value);
		  
		  Cell cellvalue= sheet.getRow(i).getCell(1); 
		  String value1 = cellvalue.getStringCellValue();
		  WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		  password.clear();
		  password.sendKeys(value1);
		  
		  WebElement login =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']" ));
		  login.click();
		  
		 // Cell cell1 = row.createCell(2);
			// cell1.setCellValue("success");
		  }
		 // FileOutputStream outputstream = new FileOutputStream(file);
			//workbook.write(outputstream);
		 
	}
	

}
