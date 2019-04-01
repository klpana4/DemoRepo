package utils;

	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ReadExcel {
		public static Object[][] getExcelData(String dataSheetName) throws IOException {
			// --- Locate the file
			XSSFWorkbook wbook = new XSSFWorkbook("./Data/"+dataSheetName+".xlsx");
			// --- Get sheet of index 0
			XSSFSheet sheet = wbook.getSheetAt(0);
			//XSSFSheet sheet = wbook.getSheet("CL");
			// --- To get the Last Row num in a sheet
			int rowCount = sheet.getLastRowNum();
			System.out.println("Row count = "+rowCount);
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println("Column count = "+columnCount);
			Object[][] data = new Object[rowCount][columnCount];
			for (int j = 1; j <= rowCount; j++) {
				XSSFRow row = sheet.getRow(j);
				for (int i = 0; i < columnCount; i++) {
					XSSFCell cell = row.getCell(i);
					data[j-1][i] = cell.getStringCellValue();
				} 
			}
			return data;
		}

	}


