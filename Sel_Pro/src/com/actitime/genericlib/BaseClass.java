package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

//import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass 
{
   public WebDriver driver;
   @Parameters("browser")
   @BeforeClass
   public void configBC(String bName)
   {
	   System.out.println("Launch d browser");
	   if(bName.equals("firefox"))
	   {
		   
		   driver= new FirefoxDriver();  
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   }
	   else if(bName.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   }//driver.manage().window().maximize();
   }
   
   @BeforeMethod
   public void configBM()
   {
	  // System.out.println("Login");
	   
	   driver.get("http://desktop-dlomk44/login.do");
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.id("loginButton")).click();
   }
   
   @AfterMethod
   public void configAM()
   {
	   System.out.println("Log-out");
	   driver.findElement(By.id("logoutLink")).click();
   }
   
   
   @AfterClass
   public void configAC()
   {
	   System.out.println("Close d Browser");
	   driver.close();
   }
   
   
   
}
