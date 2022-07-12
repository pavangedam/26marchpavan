package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\Admin\\Desktop\\selenium1\\excel sheet1.xlsx");
                     Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
                         
                   int totalNumberOfRows = mysheet.getLastRowNum(); // will give me total row count
                 
                 int rowcount = totalNumberOfRows;
                 System.out.println("Total number of row are" +rowcount);
                 
                 short totalNumberOfcells = mysheet.getRow(totalNumberOfRows).getLastCellNum();
                   int cellCount =totalNumberOfcells-1;
                   System.out.println("Total Number Of cell are"+cellCount);
                 for(int i=0;i<=rowcount;i++) //outer forloop for rows
                 {
                	for(int j=0;j<=cellCount;j++) // inner for loop for cell
                	{
                	Cell cellvalue = mysheet.getRow(i).getCell(j);
                	CellType datatype = cellvalue.getCellType();
                	
                	    if(datatype==CellType.STRING)
                	{
                		String value = cellvalue.getStringCellValue();
                		System.out.print(value+" ");
                      }
                	    else if(datatype==CellType.NUMERIC)
                	{
                	    double value = cellvalue.getNumericCellValue();
                		System.out.println(value+" ");
                	}
                	    else if(datatype==CellType.BOOLEAN)
                	{
                		boolean value = cellvalue.getBooleanCellValue();
                		System.out.println(value+" ");
                	}
                	    else if(datatype==CellType.BLANK)
                	{
               
                   	System.out.println(" ");
                	}
                  }
                	     System.out.println();
                 }
	}

}
