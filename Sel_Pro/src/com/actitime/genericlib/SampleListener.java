package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import Image.ScreenShot_Test;


public class SampleListener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult t) 
	{
		String fTestName=t.getMethod().getMethodName();
		System.out.println("----FAILED TEST----"+fTestName);
		
		
		//Screenshhot code
		/*EventFiringWebDriver edriver = new EventFiringWebDriver();
		File srcFile= edriver.getScreenshotAs(OutputType.FILE);
		File dstFile= new File("./ScreenShot/"+fTestName+".png");
		try 
		{
			FileUtils.copyFile(srcFile, dstFile);
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}*/
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
