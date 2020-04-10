package br.com.eric.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import br.com.eric.common.Property;
import br.com.eric.common.Selenium;
import br.com.eric.test.suite.AllTests;


public class BaseTestCase {
	
	protected static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {	
		if (!AllTests.isAllTestsExecution){
			driver = Selenium.getDriver();
			driver.navigate().to(Property.SITE_ADDRESS);
			driver.manage().window().maximize();
		}
	}
	
	@AfterClass
	public static void afterClass() throws Exception {
		if (!AllTests.isAllTestsExecution){
			driver.quit();
		}
	}
}
