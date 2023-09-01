package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.CartPage;
import com.PageLayer.ProductPage;
import com.TestBase.TestBase;
import com.Utility.UtilClass;

public class CartPageTest extends TestBase {
	
	String expected_Carturl = "https://www.rahulshettyacademy.com/client/dashboard/order?prop=%5B%226262e95ae26b7e1a10e89bf0%22%5D";
	@Test(priority = 4)
	public void buyNow() throws InterruptedException
	{
		product = new ProductPage();
		product.clickOnAddCart();
		Thread.sleep(5000);
		product.GoToCart();
		cart = new CartPage();
		cart.clickOnBuyNow();
		util = new UtilClass();
		String actual_Carturl = util.geturl();
		Assert.assertEquals(actual_Carturl, expected_Carturl);

	}

}
