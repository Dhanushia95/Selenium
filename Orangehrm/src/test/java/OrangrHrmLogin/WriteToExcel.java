package OrangrHrmLogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	
		public static void main(String[] args) throws IOException
		{
			String file ="C:\\Users\\dell\\Documents\\orangehrmlogindetails1.xlsx";
			FileInputStream inputstream= new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
			XSSFSheet sheet =workbook.getSheetAt(0);
			int rownum = sheet.getLastRowNum();
			for (int i=1;i<=rownum; i++)
			{
				Row row= sheet.getRow(i);
				 Cell cell = row.createCell(2);
				 cell.setCellValue("success");
			}
			FileOutputStream outputstream = new FileOutputStream(file);
			workbook.write(outputstream);
		
		}

}
