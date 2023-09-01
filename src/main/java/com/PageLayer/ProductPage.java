package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.TestBase.TestBase;

public class ProductPage extends TestBase {
	
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repo-------------
	@FindBy(xpath="(//*[@class='btn w-10 rounded'])[1]")
	private WebElement AddToCart_btn;
	
	@FindBy(xpath="//*[text()=' Product Added To Cart ']")
	private WebElement AddToCartStatus_msg;
	
	@FindBy(xpath="(//*[@class='btn btn-custom'])[3]")
	private WebElement Cart_btn;
	

	//--------action methods--------
	public void clickOnAddCart() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(AddToCart_btn));
		AddToCart_btn.click();
		//Thread.sleep(3000);
	}
	
	public String getStatusMsg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(AddToCartStatus_msg));
		String current_msg = AddToCartStatus_msg.getText();
		return current_msg;
	}
	
	public void GoToCart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Cart_btn));
		Cart_btn.click();
	}

}
