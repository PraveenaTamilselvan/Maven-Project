package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FIle {

	@Test
	public void f() throws IOException {

		ExtentReports extent;
		ExtentTest test;

		extent = new ExtentReports("./drivers/results.html", false);

		// File fis = new File("./src/main/resources/extent-config.xml");

		extent.loadConfig(new File("./src/main/resources/extent-config.xml"));

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jquery.com/");
		test = extent.startTest("TC001", "Chrome success");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File fis = new File("D:\\Autoit\\abc.jpeg");

		FileUtils.copyFile(src, fis);

		test.log(LogStatus.PASS, "testcasePassesd" + test.addScreenCapture("D:\\Autoit\\abc.jpeg"));

		extent.flush();

		extent.endTest(test);

//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//		System.out.println(fis.createNewFile());
		// FileInputStream fis1 = new FileInputStream(fis);

		System.out.println(fis);

	}

}
