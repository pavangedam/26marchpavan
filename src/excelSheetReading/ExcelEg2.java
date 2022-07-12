package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\Admin\\Desktop\\selenium1\\excel sheet1.xlsx");
             
        Workbook book= WorkbookFactory.create(myfile);
        Sheet mySheet = book.getSheet("Sheet1");
                Row myRow = mySheet.getRow(3);     
               Cell myCell = myRow.getCell(1);
               System.out.println(myCell.getCellType());
               System.out.println("==============================");
               
               //code for reading whole data from excel sheet
                   Sheet mySheet2 = book.getSheet("Sheet2");
                   
                   for(int i=0;i<=3;i++) //outer for loop-->rows
                   {
                	   for(int j=0;j<=3;j++) //inner for loop-->cells
                		   
                 {   
                 String value = mySheet2.getRow(i).getCell(j).getStringCellValue();
                		
                 System.out.print(value+ " ");
              }
                 System.out.println();
              }
                  System.out.println("===========================");    
                   
                   
                   }
              	}

	
                
