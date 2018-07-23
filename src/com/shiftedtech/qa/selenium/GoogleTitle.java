package com.shiftedtech.qa.selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTitle {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_jar\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://google.com");
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title does not match");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
