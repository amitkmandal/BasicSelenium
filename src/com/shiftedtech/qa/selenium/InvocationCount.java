package com.shiftedtech.qa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
	public WebDriver driver = null;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_jar\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@Test(invocationCount=10)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("sum == "+ c);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
