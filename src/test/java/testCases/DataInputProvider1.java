package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataInputProvider1 {
	@Test(dataProvider = "abc")

	// @Parameters({ "UserName" })
	public void f(String UserName, String Password) {

		System.out.println(UserName + " " + Password);
	}

	@DataProvider(name = "abc")
	public Object[][] getvalues() throws IOException {
		FileInputStream fis = new FileInputStream("./data/TC002.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		System.out.println(sheet.getPhysicalNumberOfRows());
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);

		String[][] values = new String[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				XSSFRow row = sheet.getRow(i);

				XSSFCell cell = row.getCell(j);

				String val = cell.getStringCellValue();

				values[i - 1][j] = val;

			}

		}

		return values;

	}
}