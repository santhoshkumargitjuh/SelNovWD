package learnExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	public Object[][] readExcel(String sheetName) throws InvalidFormatException, IOException {

		//Load the Excel File
		File src = new File("./data/"+sheetName+".xlsx");	

		//Open the Book
		XSSFWorkbook wb = new XSSFWorkbook(src);

		//Go to Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");

		//Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);

		//Column Count
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println(column);
		
		Object[][] data = new Object[rowCount][column];
		
		// Row - for
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);	

			//Column - for
			for (int j = 0; j < column; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
				
				
				
				
				//CellType - String
				/*if (cell.getCellTypeEnum()==CellType.STRING) {
					System.out.println(cell.getStringCellValue());	
					//CellType - Integer
				} else if (cell.getCellTypeEnum()==CellType.NUMERIC) {


					System.out.println((int)cell.getNumericCellValue());
				}*/
			}
		}
		return data;

	}
}
