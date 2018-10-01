package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle_Test 
{
   WebDriver driver;
   @Test
   @Parameters("browser")
   public void verifyPageTitle_Test(String bName)
   {
	   if(bName.equalsIgnoreCase("firefox"))
	   {
		   driver= new FirefoxDriver();
	   }
	   else if(bName.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
		   driver= new ChromeDriver();
	   }
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://gmail.com");
	   String Title=driver.getTitle();
	   System.out.println(Title);
	   //driver.close();
   }
}
