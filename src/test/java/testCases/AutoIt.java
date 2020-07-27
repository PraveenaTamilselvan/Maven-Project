package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIt {

	@Test
	public void AutoIT() throws IOException, InterruptedException {

		System.setProperty("webdriver.chome.driver", "./divers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();

		driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']")).click();

		// driver.findElement(By.name("uploaded_file")).click();

		Runtime.getRuntime().exec("D:/Autoit/test.exe");

	}
}
