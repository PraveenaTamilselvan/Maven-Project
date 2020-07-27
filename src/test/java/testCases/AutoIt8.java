package testCases;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AutoIt8 {

	@Test
	public void AutoIT() throws IOException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.ANY);
		dc.setVersion("83");
		URL url = new URL("http://192.168.1.6:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		// System.setProperty("webdriver.chome.driver", "./divers/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();

		driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']")).click();

		// driver.findElement(By.name("uploaded_file")).click();

		Runtime.getRuntime().exec("D:/Autoit/test.exe");
		driver.quit();

	}
}
