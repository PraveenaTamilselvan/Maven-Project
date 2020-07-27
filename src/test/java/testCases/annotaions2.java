package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = { "Arun" })
public class annotaions2 {
	@Test(groups = "test1")

	public void a() {

		System.out.println(" I am @Test1");
	}

	@Test(groups = { "test2" })
	public void b() {

		System.out.println(" I am @Test2");
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups = { "test3" })
	public void c() {

		System.out.println(" I am @Test3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" I am @beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(" I am @afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println(" I am @beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println(" I am @afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" I am @beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" I am @afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" I am @beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" I am @afterSuite");
	}

}
