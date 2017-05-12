package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {
	
	public InternetExplorerDriver driver; //ChromeDriver driver;//WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching IE browser");
	//	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	//	driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPageTitleSampleB() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	@Test
	public void testSampleOne() throws InterruptedException {
		driver.findElement(By.id("lst-ib")).sendKeys("Test case in IE");
		Thread.sleep(3000);
		System.out.println("Im in test sample one");
	}
	
	@Test
	public void testSampleTwo() {
		System.out.println("Im in test sample two");
	}
	
	@Test
	public void testSampleThree() {
		System.out.println("Im in test sample three");
	}

	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing IE browser");
			driver.quit();
		}
	}
	
}