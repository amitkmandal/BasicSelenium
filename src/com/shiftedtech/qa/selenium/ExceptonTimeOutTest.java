package com.shiftedtech.qa.selenium;

import org.testng.annotations.Test;

public class ExceptonTimeOutTest {
	//@Test(invocationTimeOut=1)
	/*public void infiniteLop() {
		int i = 1;
		while(i == 1) {
			System.out.println(i);
			//i++;
		}
	}*/
	
	@Test(invocationCount=2, expectedExceptions = NumberFormatException.class)
	public void test1() {
		String string = "100A";
		Integer.parseInt(string);
	}

}
