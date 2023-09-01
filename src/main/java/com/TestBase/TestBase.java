package com.TestBase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.PageLayer.CartPage;
import com.PageLayer.LoginPage;
import com.PageLayer.OrderPage;
import com.PageLayer.ProductPage;
import com.Utility.ConfigReader;
import com.Utility.UtilClass;


public class TestBase {
    public static WebDriver driver;
    public UtilClass util;
    public LoginPage login;
    public ProductPage product;
    public CartPage cart;
    public OrderPage order;
    public static WebDriverWait wait;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		ConfigReader cr = new ConfigReader();
		String browsername = cr.readConfig("Browser");
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Please provide correct browser");
		}
		
		String url = cr.readConfig("Testsiteurl");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//------------Steps for login--------------
		LoginPage login = new LoginPage();
		login.enterUsername();
		login.enterPassword();
		login.clickOnLogin();

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

