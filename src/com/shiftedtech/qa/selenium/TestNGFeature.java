package com.shiftedtech.qa.selenium;

import org.testng.annotations.Test;

public class TestNGFeature {
	
	@Test
	public void loginTest() {
		System.out.println("Login page");
		//int i = 5/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePage() {
		System.out.println("Home page test ");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPage() {
		System.out.println("search page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registrationPage() {
		System.out.println("Registration page test");
		
	}

}
