package com.shiftedtech.qa.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	
	/*
	 * section-1
	 * precondition annotation --> starting from @Before
	 */
	
	@BeforeSuite
	public void setUp() {
		System.out.println("set up system property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch chrome Browser");
	}
	
	@BeforeTest
	public  void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void openUrl() {
		System.out.println("Open an Url");
	}
	
	/*
	 * section-2
	 * test cases --> starting from @Test
	 */
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title");
	}
	
	/*
	 * section-3
	 * post condition --> starting from @After
	 */
	
	@AfterMethod
	public void logOut() {
		System.out.println("logout from App");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete All cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report");
	}
	

}
