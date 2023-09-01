package com.Utility;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	//------------get url---------------------
	public String geturl()
	{
		String current_url=driver.getCurrentUrl(); 
		return current_url;
	}
	
	//----------steps to capture screenshot--------------------
	static String path="D:\\eclipse workspace\\wingify assignment\\qawingify\\QaWingify\\Screenshots\\";
	
	public static void takeScreenshot(String filename)
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		}
		catch(IOException e)
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}
	}
	}
	




