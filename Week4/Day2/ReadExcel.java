package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		//Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./Data/CreateLead.xlsx");
		
		//Open Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To count the number of rows - without header
		int rowCount = ws.getLastRowNum();
		System.out.println("Row count is : "+rowCount);
		
		//To count the number of rows - with header
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		
		//To count the number of columns
		int columnCount = ws.getRow(1).getLastCellNum();
		System.out.println("Column count is: "+columnCount);
		
		//To retrieve a particular value in a cell
		String row1column1Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(row1column1Data);
		
		
		//To retrieve a entire data
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println(allData);
				
			}
			
		}
		
	}

}
