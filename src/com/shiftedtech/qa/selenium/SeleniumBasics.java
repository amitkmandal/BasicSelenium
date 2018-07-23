package com.shiftedtech.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium_jar\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

}
