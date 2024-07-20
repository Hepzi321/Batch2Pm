package batch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DemoExcelReader {
	
	@DataProvider  //supply data to your test
	
	public String[][] getData() throws EncryptedDocumentException, IOException
	
	{
		
		String excelsheetname = "Login";
		File f = new File(System.getProperty("user.dir") +"\\src\\test\\resources\\TestData\\Batchsheet.xlsx");
		
		
		//Step 1
		
		FileInputStream fis = new FileInputStream(f);  // Reading the file
		
		//step 2
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//
		
		Sheet sheetname = wb.getSheet(excelsheetname);
		
		//Step 3
		int rows = sheetname.getPhysicalNumberOfRows();
		
		System.out.println("Number of rows:" +rows);
		
		//Step 4
		
		int Columns = sheetname.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Number of Columns " + Columns);
		
		// Step 5
		
		DataFormatter format = new DataFormatter();
		
		String[][] testdata = new String[rows][Columns];
		
		
		
		for(int row = 1; row<rows; row++)
			
		{
			for(int col=0; col<Columns; col++)
			{
				testdata[row-1][col] = format.formatCellValue(sheetname.getRow(row).getCell(col));
				
				System.out.println(testdata[row-1][col]);
			}
			
			
		}
			
		return testdata;
		
	}

}
