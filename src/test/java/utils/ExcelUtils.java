package utils;


import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet	sheet;

	public ExcelUtils(String excelPath,String sheetName) {
		
		try {

			InputStream file = new FileInputStream(excelPath);
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet(sheetName);

		}
		catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}}
	

	public static void getCellData(int rowNum,int collNum) {

		DataFormatter formatter = new DataFormatter();
		Object value= formatter.formatCellValue(sheet.getRow(rowNum).getCell(collNum));
		System.out.println(value);


	}
	public static void getRowCount() {

		int rowCount =sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows:" +rowCount);




	}


}
