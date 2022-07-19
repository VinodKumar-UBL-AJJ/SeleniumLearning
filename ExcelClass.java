package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {
	
	
	public static String[][] excelData() throws IOException {
		
		//Aim: Reading excel
		
		//1. Read the file location.
		//2. Create an object for workbook.
		//3. Go to the work sheet.
		//4. Row iteration and get row values.
		//5. cell iteration and get cell values
		
		XSSFWorkbook wb= new XSSFWorkbook("./data/TC002.xlsx");
		XSSFSheet ws= wb.getSheetAt(0);
		int rowsCount= ws.getLastRowNum();
		int cellCount= ws.getRow(0).getLastCellNum();
		
		String[][] data= new String[rowsCount][cellCount];
		
		for(int i=1; i<=rowsCount; i++) {
			
			for(int j=0; j<cellCount; j++) {
				
				String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]= CellValue;
			}
		}
		
		wb.close();
		
		
		return data;
		
	}

}
