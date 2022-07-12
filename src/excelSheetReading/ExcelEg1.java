package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		// create excel sheet and pass the along with name and extension file object
		
		File myFile=new File("C:\\Users\\Admin\\Desktop\\selenium1\\excel sheet1.xlsx");
		
		//using WorkBookFactory class read excel sheet
		// how to read string value
        String name = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
         
        System.out.println(name);
        
    // how to read numeric value
        double number = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
        
        System.out.println(number);
        
        //how to read char value
        String mychar = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
        
        System.out.println(mychar);
        
        //how to read boolean value
 boolean myValue = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(3).getCell(1).getBooleanCellValue();
        System.out.println(myValue);
}
}