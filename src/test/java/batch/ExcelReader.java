package batch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader {
	
	public void getData() throws EncryptedDocumentException, IOException
	{
        File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\Batchsheet.xlsx");
        
        FileInputStream fis = new FileInputStream(f);
        
        WorkbookFactory.create(fis);
	}
	

	
}
