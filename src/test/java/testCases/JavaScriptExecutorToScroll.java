package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorToScroll {
	@Test
	public void scroll() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.MINUTES);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://jquery.com/");

		((JavascriptExecutor) driver).executeScript("scroll(0,8000)");

	}
}
