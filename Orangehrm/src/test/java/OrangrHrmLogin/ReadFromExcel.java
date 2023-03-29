package OrangrHrmLogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	
	public static void main(String[] args) throws IOException
	{
		String file ="C:\\Users\\dell\\Documents\\orangehrmlogindetails1.xlsx";
		FileInputStream  inputstream =new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet =workbook.getSheetAt(0);
		int rownum = sheet.getLastRowNum();
		System.out.println("last row:"+rownum);
		
		for(int i =1; i<=rownum;i++)
		{
			Row row =sheet.getRow(i);
			
			int cellnum = row.getLastCellNum();
			System.out.println("column num:"+cellnum);
			
			for(int j=0; j<cellnum; j++)
			{
				Cell cell =row.getCell(j);
				String value =cell.getStringCellValue();
				
				System.out.println(value);
			}
			System.out.println();
		}
	}

}
