package com.TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.CartPage;
import com.PageLayer.OrderPage;
import com.PageLayer.ProductPage;
import com.TestBase.TestBase;
import com.Utility.UtilClass;

public class OrderPageTest extends TestBase{
	String expected_Orderurl = "https://www.rahulshettyacademy.com/client/dashboard/order?prop=%5B%226262e95ae26b7e1a10e89bf0%22%5D";
	@Test(priority = 5)
	public void placeOrder() throws InterruptedException, IOException
	{
		product = new ProductPage();
		product.clickOnAddCart();
		Thread.sleep(5000);
		product.GoToCart();
		cart = new CartPage();
		cart.clickOnBuyNow();
		order = new OrderPage();
		order.enterCvv();
		order.enterName();
		order.selectCountry();
		order.clickOnPlaceOrder();
		util = new UtilClass();
		String actual_Orderurl = util.geturl();
		Assert.assertEquals(actual_Orderurl, expected_Orderurl);
	}
}
