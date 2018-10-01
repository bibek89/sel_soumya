package com.actitime.loginTest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.actitime.genericlib.FileData;
import com.actitime.objectRepository.Log_In;
//import com.acttime.objectrepositorylib.Login;

public class Login_Test 
{
    FileData fdata= new FileData();
    WebDriver driver;
    Properties pobj;
    
    @BeforeClass
    public void configBC() throws Throwable
    {
    	pobj= fdata.getPropertyObj();
    	System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    
    @Test
    public void Verify_Invalid_UserName_Test() throws Throwable
    {
    	String Invlid_UseNm=fdata.getExcelData("Sheet1", 2, 2);
    	String errMsg=fdata.getExcelData("Sheet1", 2, 3);
    	driver.get(pobj.getProperty("url"));
    	
    	Log_In lpage=PageFactory.initElements(driver, Log_In.class);
    	
    	//Enter invalid UserName
    	lpage.getUserEdit().sendKeys(Invlid_UseNm);
    	lpage.getLogin_Edit().click();
    	
    	String actMsg=lpage.getErrMsg().getText();
    	Assert.assertEquals(errMsg, actMsg);
    	
    }
    
    @Test
    public void verify_Invalid_Pwd() throws Throwable
    {
    	String invalid_Pwd=fdata.getExcelData("Sheet1", 3, 2);
    	String errMsg= fdata.getExcelData("Sheet1", 2, 4);
    	driver.get(pobj.getProperty("url"));
    	
    	Log_In lpge=PageFactory.initElements(driver, Log_In.class);
    	lpge.getPwdEdit().sendKeys(invalid_Pwd);
    	lpge.getLogin_Edit().click();
    	
    	String Act_Msg= lpge.getErrMsg().getText();
  	  //Verify Error Msg
  	  Assert.assertEquals(errMsg, Act_Msg);
    }
    @Test
	public void verifyErrorMsgWithOutDataTest() throws InvalidFormatException, IOException, Throwable{
		//reading test data from Excel
		String errorMSg = fdata.getExcelData("Sheet2", 5, 2);
		driver.get(pobj.getProperty("url"));
		
		
		//click on login Button with out data
		Log_In lpage = PageFactory.initElements(driver, Log_In.class);
		lpage.getLogin_Edit().click();
		
		 String actMSg = lpage.getErrMsg().getText();
         
		//verify Error msg
	   Assert.assertEquals(errorMSg, actMSg);
	}
    @AfterClass
    public void configAC()
    {
    	driver.close();
    }
}
