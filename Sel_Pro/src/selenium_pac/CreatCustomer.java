package selenium_pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatCustomer 
{
	static WebDriver driver;
	public static void main(String[] args) throws Throwable 
	{
		//get d file location
		FileInputStream fis = new FileInputStream(".//CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String urlVal=pobj.getProperty("url");
		String UserName=pobj.getProperty("username");
		String passwod=pobj.getProperty("password");
		String browserVal=pobj.getProperty("browser");
		
		System.out.println(urlVal);
		System.out.println(UserName);
		System.out.println(passwod);
		System.out.println(browserVal);
		
		
		
		if(browserVal.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserVal.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".//Resource//chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.get(urlVal);
		
		
	}

}
