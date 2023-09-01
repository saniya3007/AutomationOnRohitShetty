package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.Utility.UtilClass;

public class LoginPageTest extends TestBase {
	
	String expected_Homeurl="https://www.rahulshettyacademy.com/client/auth/login";
	@Test(priority = 1)
	public void verifyLoginTest()
	{
	    util = new UtilClass();
		String actual_Homeurl = util.geturl();
		Assert.assertEquals(actual_Homeurl, expected_Homeurl);
	}	
}
