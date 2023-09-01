package com.PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;
import com.Utility.ConfigReader;

public class LoginPage extends TestBase {
	ConfigReader cr = new ConfigReader();
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//--------obj repo-------------
	@FindBy(xpath="//*[@id='userEmail']")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//*[@id='userPassword']")
	private WebElement password_txtbox;

	@FindBy(xpath="//*[@id='login']")
	private WebElement login_btn;
	

	//-------action methods---------
	public void enterUsername() throws IOException
	{
		String username = cr.readConfig("Username");
		username_txtbox.sendKeys(username);	
	}
    public void enterPassword() throws IOException
    {
		String password = cr.readConfig("Password");
    	password_txtbox.sendKeys(password);
    }
    public void clickOnLogin()
    {
    	login_btn.click();
    }
}

