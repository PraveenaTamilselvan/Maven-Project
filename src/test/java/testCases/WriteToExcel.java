package testCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteToExcel {

	@Test
	public void getvalues() throws IOException {
		FileInputStream fis = new FileInputStream("./data/TC002.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		System.out.println(sheet.getPhysicalNumberOfRows());
		// int colCount = sheet.getRow(0).getLastCellNum();
		// System.out.println(colCount);
		for (int i = rowCount + 1; i < 20; i++) {
			for (int j = 0; j < 1; j++) {
				XSSFRow row = sheet.createRow(i);
				XSSFCell cell = row.createCell(j);
				cell.setCellValue("Vaibhav");

			}
		}
		FileOutputStream fos = new FileOutputStream("./data/TC002.xlsx");
		wb.write(fos);
		wb.close();
	}
}