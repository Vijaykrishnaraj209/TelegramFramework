package fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;;

public class Excelutility {
	public static String[][] readexceldata(String sheetname) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
	    Workbook book=WorkbookFactory.create(fis);
	    Sheet sheet=book.getSheet(sheetname);
	    int rowCount=sheet.getPhysicalNumberOfRows();
	    int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
	    String[][]data=new String[rowCount-1][cellCount];
	    
	    fpr(int i=1;i<rowCount;i++) {
	    	for(int j=0;j<cellCount;j++) {
	    		data[i-1][j]=sheet.getRow(i).getCell(j).toString();
	    		
	    	
	    	}
	    }
		
	}
	

}
