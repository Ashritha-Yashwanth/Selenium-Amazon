package package2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Data
{
	public static String un1;
	public static  String pwd;
 public void Data_fetching() throws EncryptedDocumentException, IOException
 {
	 FileInputStream f1 = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Selenium_Basic_Program\\TestData\\Ashritha-Excel.xlsx");
     Workbook wb =  WorkbookFactory.create(f1);
     un1 = wb.getSheet("amazon_login").getRow(1).getCell(0).getStringCellValue();
    
      pwd = wb.getSheet("amazon_login").getRow(1).getCell(1).getStringCellValue();
    
 }
}
