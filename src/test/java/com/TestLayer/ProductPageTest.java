package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.ProductPage;
import com.TestBase.TestBase;
import com.Utility.UtilClass;

public class ProductPageTest extends TestBase{
	String expected_msg = "Product Added To Cart";
	String expected_Producturl = "https://www.rahulshettyacademy.com/client/dashboard/cart";
		@Test(priority = 2)
		public void addToCart() throws InterruptedException 
		{
		    product = new ProductPage();
			product.clickOnAddCart();
			String actual_msg = product.getStatusMsg();
			Assert.assertEquals(actual_msg, expected_msg);
		}
		
		@Test(priority = 3)
		public void goToCart()
		{
		    product = new ProductPage();
			product.GoToCart();
			util = new UtilClass();
			String actual_Producturl = util.geturl();
			Assert.assertEquals(actual_Producturl, expected_Producturl);
		}
	}

