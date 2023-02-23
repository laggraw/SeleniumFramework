package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getData(String path, String SheetName, int rowNum , int cellNum) {
		
		String v = "";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path)); 
			v = wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}
}
