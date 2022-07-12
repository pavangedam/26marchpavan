package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args)throws InterruptedException 
	{
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium1\\chromedriver_win32 (5)\\chromedriver.exe");
                
                  WebDriver driver=new ChromeDriver();
                  driver.manage().window().maximize();
                  driver.get("https://vctcpune.com/selenium/practice.html");
                  
                 Thread.sleep(1000);
                  //how to find out number of rows in a table
                 
            List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        int totalnumofRows = rows.size();
        System.out.println("total num of Rows "+totalnumofRows);
        
        //how to find out num of column in a table
       List<WebElement> NoOFColumn = driver.findElements(By.xpath("//table//tr//th"));
           int col = NoOFColumn.size();
           System.out.println("total no of col "+col);
           for(WebElement header:NoOFColumn )
           {
        	   System.out.print(header.getText()+ " ");
           }
           
           //how to find all rows from table
           List<WebElement> alltableData = driver.findElements(By.xpath("//table//tr"));
         Iterator<WebElement> it = alltableData.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next().getText()+" ");
        	 System.out.println();
         }
	}

	
}
