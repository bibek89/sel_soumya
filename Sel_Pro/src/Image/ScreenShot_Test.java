package Image;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
//@Listeners(com.actitime.genericlib.SampleListener.class)
public class ScreenShot_Test extends BaseClass
{
	//public static WebDriver driver= new FirefoxDriver();
   /* @Test(priority=1)
    public void cretecust_Test()
    {
    	WebDriver driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("http://gmail.com");
    	
    	EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
    	File srcFile= edriver.getScreenshotAs(OutputType.FILE);
    	File dstFile= new File("C:\\Users\\bibek\\Desktop\\Cases of Absolut X-Path\\Myimage2.png");
    	FileUtils.copyFile(srcFile, dstFile);
    	
    	System.out.println("Execute CreateCustomr Test");
    	//driver.get("https://gmail.com");
		Assert.assertEquals("A","B");
    	driver.close();
    	
    }
    @Test(priority=2)
	public void Creat_Customr_With_DescTest()
	{
		System.out.println("Execute Creat_Customr_With_Desc");
	}*/
	
	
	
	
	@Test
	public void gmail_Test() 
	{
		/*System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		File srcFile= edriver.getScreenshotAs(OutputType.FILE);
		File dstFile= new File("./ScreenShot/myImage1.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.close();
		
		
		System.out.println("Execute Create Customr Test");
		Assert.assertEquals("A", "B");
		System.out.println("gmail Test z Verified");*/
		System.out.println(driver.getTitle());
		System.out.println("Execute Gmail");
	}
	/*@Test
	public void gmail_with_Desc_Test()
	{
		System.out.println("Execute gmail with Desc");
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
