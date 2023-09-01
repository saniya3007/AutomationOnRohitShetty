package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.TestBase.TestBase;

public class CartPage extends TestBase{
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repo-------------
	@FindBy(xpath = "(//*[@class='btn btn-primary'])[2]")
	private WebElement BuyNow_btn;
	
	//--------action methods--------
	public void clickOnBuyNow() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(BuyNow_btn));
		Thread.sleep(5000);
		BuyNow_btn.click();
	}


}
