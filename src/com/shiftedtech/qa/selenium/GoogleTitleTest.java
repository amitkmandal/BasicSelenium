package com.shiftedtech.qa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver = null;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_jar\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://google.com");
	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		String string = driver.getTitle();
		System.out.println(string);
	}
	
	@Test(priority=2)
	public void googleTest() {
		boolean b = driver.findElement(By.xpath("//a[@class='gb_P']")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
