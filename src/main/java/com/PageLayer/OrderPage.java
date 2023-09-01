package com.PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;
import com.Utility.ConfigReader;

public class OrderPage extends TestBase {
	ConfigReader cr = new ConfigReader();
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repo-------------
	@FindBy(xpath="(//*[@class='input txt'])[1]")
	private WebElement cvv_txtbox;
	
	@FindBy(xpath="(//*[@class='input txt'])[2]")
	private WebElement name_txtbox;
	
	@FindBy(xpath="(//*[@class='input txt text-validated'])[2]")
	private WebElement country_txtbox;
	
	@FindBy(xpath="(//*[@class='ng-star-inserted'])[4]")
	private WebElement select_country;
	
	@FindBy(xpath="//*[@class='btnn action__submit ng-star-inserted']")
	private WebElement placeOrder_btn;
	
	//--------action methods--------
	public void enterCvv() throws IOException
	{
	   String cvv = cr.readConfig("Cvv");
	   cvv_txtbox.sendKeys(cvv);
	}
	
	public void enterName() throws IOException
	{
		String name = cr.readConfig("Name");
		name_txtbox.sendKeys(name);
	}
	
	public void selectCountry() throws IOException, InterruptedException
	{
		String country = cr.readConfig("Country");
		country_txtbox.sendKeys(country);
		Thread.sleep(3000);
		select_country.click();
	}
	
	public void clickOnPlaceOrder()
	{
		placeOrder_btn.click();
	}


}
