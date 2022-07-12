package kiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	//excel
	//screenshot
	//closing
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\Admin\\Desktop\\selenium1\\excel sheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Admin\\Desktop\\selenium1\\screenshot1\\mysrc"+TCID+".png");
	 
	 FileHandler.copy(src, dest);
	 
	}
	
}
