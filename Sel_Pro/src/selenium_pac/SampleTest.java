package selenium_pac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class SampleTest 
{
	//To get String data from excel
	
	public static String getData(String filePath,String sheetName,int rn,int cn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			String data=sh.getRow(rn).getCell(cn).getStringCellValue();
			return data;
		}
		catch (Exception e) 
		{
			return " "; 
		}
	}
	public static int getRowCount(String filePath,String sheetName)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rn=sh.getLastRowNum();
			return rn;
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			return 0;
		}
		
		
	}
	
	
	public static int getCellCount(String filePath,String sheetName)
	{
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int cn =sh.getRow(0).getLastCellNum();
			return cn;
		}
		catch (Exception e) 
		{
		
			return 0;	
		}
		
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		/*FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//navigate to web application
		driver.get("https://gmail.com");
		
		//identify d email editbox in gui
		WebElement elemnt = driver.findElement(By.id("identifierId"));
		elemnt.sendKeys("89bibek");
		driver.findElement(By.xpath("//span[text()='Next']")).click();*/
		
		
		
		
		
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);*/
		/*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("bibeksahoo89");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("password")).sendKeys("microprocessor234");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String actVal=driver.getTitle();
		System.out.println(actVal);
		
		  
		String expVal="Inbox";
		if(actVal.contains(expVal))
		{
			System.out.println("Home page z verified --->pass");
		}
		else
		{
			System.out.println("Home page z not verified--->fail");
		}*/
		
		//logout
		
		/*driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gb_71")).click();*/
		
		
		
		
		
		
		
		
		
	/*	String expmsg="Couldn't find your Google Account";
		String eMail_id="bibek";
		String expColor="rgba(213, 0, 0, 1)";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys(eMail_id);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(2000);
		String actMsg="(//div[@class='dEOOab RxsGPe'])[1]";
		if(expmsg.equals(actMsg))
		{
			System.out.println("Error z verifed -->pass");
		}
		else
		{
			System.out.println("Err z not verifed-->fail");
		}
		
		String actColor=driver.findElement(By.xpath("(//div[@class='dEOOab RxsGPe'])[1]")).getCssValue("color");
		System.out.println(actColor);
		if(expColor.equals(actColor))
		{
			System.out.println("color z verifed-->pass");
		}
		else
		{
			System.out.println("color z not verifed-->fail");
		}*/
		
		
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		WebElement wbTextbx=driver.findElement(By.id("identifierId"));
		String backVal=wbTextbx.getAttribute("aria-label");
		System.out.println(backVal);
		Point p=wbTextbx.getLocation();
		System.out.println(p);
		System.out.println("X-Cordinate="+p.getX());
		System.out.println("Y-Cordinate="+p.getY());
		Dimension  dim = wbTextbx.getSize();
		System.out.println("Height of d Elmnt "+dim.getHeight());
		System.out.println("Width of d Elmnt "+dim.getWidth());
		Thread.sleep(5000);
		driver.close();*/
		
		
		
		
		/*WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		JavascriptExecutor jsObj=(JavascriptExecutor)driver;
		
		
		
		
		String jsType="document.getElementById('email').value='bibek'";
		String pwdBox="document.getElementById('pass').value='bibek'";
		String jsClck="document.getElementById('u_0_2').click()";
		
		jsObj.executeScript(jsType);
		jsObj.executeScript(pwdBox);
		//jsObj.executeScript(jsClck);
		
		String scrolBar="window.scrollBy(0,500)";
		jsObj.executeScript(scrolBar);*/
		
		
		
		
		
		
		
        //System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		
		/*WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/bibek/Desktop/drop.html");
		WebElement webDrop=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel = new Select(webDrop);
	    boolean stats= sel.isMultiple();
		if(stats)
		{
			for(int i=0;i<6;i++)
			{
				sel.selectByIndex(i);
			}
		}
		else
		{
			System.out.println("not a multiselect dropdwn");
		}*/
		
		
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/bibek/Desktop/drop.html");
		WebElement wbDrop= driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel = new Select(wbDrop);
		List<WebElement> lst= sel.getOptions();
		System.out.println(lst.size());
		//String expVal1="Testing";
		TreeSet<String> set = new TreeSet<String>();
		for(WebElement obj:lst)
		{
			set.add(obj.getText());
		}
		//show 
		
		for(String tmp:set)
		{
			System.out.println(tmp+" ");
		}*/
		
		
		
		
		
		
		
		//System.out.println(set+" ");
		
		
		//String expVal2="C++";*/
	    /*for(int i=0;i<=lst.size();++i)
	    {
	    	sel.selectByIndex(i);
	    	i++;
	    	while(i>lst.size())
	    	{
	    		System.out.println("mngo");
	    		break;
	    	}
	    	//String actVal=lst.get(i).getText();
	    	if(expVal1.equals(actVal) || expVal2.equals(actVal))
	    	{
	    		sel.selectByVisibleText(expVal1);
	    		sel.selectByVisibleText(expVal2);
	    		System.out.println(expVal1+" ,"+expVal2 + " value z availaible");
	    		break;
	    	}
	    	
	    	
	    	if(actVal.contains(expVal1))
	    	{
	    		sel.selectByVisibleText(actVal);
	    		System.out.println(actVal);
	    	}
	    	
	   
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }*/
		
		
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement wb = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
	     String actMsg="selenium";
		for(int i=0;i<links.size();i++)
		{
			WebElement expMsg =links.get(i);
			//.getText();
			String str= expMsg.getText();
			
			if(actMsg.equalsIgnoreCase(str))
			{
				expMsg.click();
				break;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//span[text()='Full Store Directory']")).click();
		/*WebElement firetv=driver.findElement(By.xpath("(//span[text()='Amazon Fire TV Stick'])[1]"));
		act.moveToElement(firetv).perform();*/
		
		
		
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro j");
		WebElement emt = driver.findElement(By.xpath("//b[text()='obs in bangalore']"));
		emt.click();
		
		String scrobar= "window.scrollBy(0,800)";
		JavascriptExecutor jobj = (JavascriptExecutor)driver;
		jobj.executeScript(scrobar);
		
		WebElement wb = driver.findElement(By.linkText("Wipro Careers | Discover a World of Opportunities | Join Us Today!"));
		
		Actions act = new Actions(driver);
		act.contextClick(wb).perform();
		act.sendKeys("T").perform();*/
		
		/*WebElement wb_Txtuser= driver.findElement(By.name("username"));
		wb_Txtuser.sendKeys("admin");
		Actions act = new  Actions(driver);
		act.doubleClick(wb_Txtuser).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();*/
		
		
		
		
		
		
		
		
		///drag n drop operation
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement wb_Source= driver.findElement(By.id("draggable"));
		WebElement wb_Dest = driver.findElement(By.id("droptarget"));
		Actions act = new Actions(driver);
		act.dragAndDrop(wb_Source, wb_Dest).perform();*/
		
		
		
		
		
		
		
	/*	WebDriver driver= new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try
		{
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		
		
		driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
		String path="//a[text()='Apple iPhone X (Silver, 256 GB)']/following-sibling::a[@target='_blank']/div/div";
		String P_Price=driver.findElement(By.xpath(path)).getText();
		System.out.println(P_Price);*/
		
		
		
	/*	WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		try
		{
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		
		
		driver.findElement(By.name("q")).sendKeys("nokia",Keys.ENTER);
		
		String path="//span[contains(text(),'Showing')]";
		String uiText=driver.findElement(By.xpath(path)).getText();
		//System.out.println(uiText);
		String[] arr=uiText.split(" ");
		String count=arr[5];
		int account=Integer.parseInt(count);
		System.out.println(count);*/
		
		
		
		//capture all prodct rating and price in amazon.in
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x",Keys.ENTER);
		
		String scrobar= "window.scrollBy(0,600)";
		JavascriptExecutor jobj = (JavascriptExecutor)driver;
		jobj.executeScript(scrobar);
		
		
		String price_Path = "//h2[text()='Apple iPhone X (Silver, 256GB)']/../../../../div[2]/div[1]/div/a/span[2]";
		String act_Price= driver.findElement(By.xpath(price_Path)).getText();
		System.out.println(act_Price);
		
		String rat_Path="//h2[text()='Apple iPhone X (Silver, 256GB)']/../../../../div[2]/div[2]/div/span/span/a/i[1]";
		
		//String rat_path1=".//*[@id='result_3']/div/div/div/div[2]/div[2]/div[2]/div/span/span/a/i[1]/span";
		
		WebElement wb_Ratpth = driver.findElement(By.xpath(rat_Path));
		Actions act = new Actions(driver);
		act.moveToElement(wb_Ratpth).perform();
		
List<WebElement>  ratng = driver.findElements(By.xpath("//table[@id='histogramTable']/tbody/tr/td/span[1]/a"));
         for(int i=0;i<ratng.size();i++)
         {
        	 System.out.println(ratng.get(i).getText());
         }*/
		
		
		
		
		//capture all d links availbl in yahoo.com
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
	    List<WebElement> wb_tagnm =driver.findElements(By.tagName("a"));
		System.out.println(wb_tagnm.size());
		//Disply all d links
		
		for(WebElement obj:wb_tagnm)
		{
			System.out.println(obj.getText());
		}*/
		
		//capture 10 top news availaible in yahoo.com
		
	    /*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		List<WebElement>  lst = driver.findElements(By.xpath("//div[text()='Trending now']/../../../ul/li/ul/li/a/span[2]"));
		for(WebElement obj : lst)
		{
			System.out.println(obj.getText());
		}*/
		
		
		//check all d checkbox in gmail
		
		//Everythng z corrct but dont know why its not working
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("bibeksahoo89");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("microprocessor234");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> wb_Chckbx=driver.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr/td[2]/div/div"));
		
		//real xpath==//table[@class='F cf zt']/tbody/tr/td[2]/div/div
		
		for(WebElement obj : wb_Chckbx)
		{
			System.out.println("ok");
			obj.click();
		}
		System.out.println(wb_Chckbx.size());*/
		/*for(int i=0;i<wb_Chckbx.size();i++)
		{
			wb_Chckbx.get(i).click();
		}*/
		
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parent_Id=driver.getWindowHandle();
		
		System.out.println("Parent id is "+parent_Id);
		
		//driver.findElement(By.xpath("(//a[text()=' Click this link to start new Tab '])[1]")).click();
		
		Set<String> child_Id=driver.getWindowHandles();
		
		int count=child_Id.size();
		
		System.out.println("Total Child Id "+count);
		
		for(String obj :child_Id)
		{
			if(!parent_Id.equalsIgnoreCase(obj))
			{
				driver.switchTo().window(obj);
				//driver.findElement(By.name("q")).sendKeys("bibek");
				
				System.out.println("Child Title iz "+driver.getTitle());
				
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.close();
			}
		}
		driver.switchTo().window(parent_Id);
		System.out.println(driver.getTitle());*/
		
		
		
		//handle alert on irctc site
		//=========================================
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.xpath("//span[text()='AGENT LOGIN']")).click();
		driver.findElement(By.id("loginbutton")).click();
		
		Alert alt =driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.id("usernameId")).sendKeys("Bibek");*/
		
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\MOR_SELENIUM_BATCH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		
		
		List<WebElement> dates=driver.findElements(By.xpath("//html/body/div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		
		
		int count=dates.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String dt=dates.get(i).getText();
			System.out.println(dt);
			if(dt.equals("27"))
			{
				dates.get(i).click();
				System.out.println("ok");
				break;
			}
		}*/
		
		
		
		/*FirefoxProfile profil = new FirefoxProfile();
		profil.setPreference("browser.download.folderList", 2);
		profil.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");		
		profil.setPreference("browser.download.dir", "Z:\\Filedownlod");
		
		WebDriver driver = new FirefoxDriver(profil);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://maven.apache.org/download.cgi");
		driver.findElement(By.linkText("apache-maven-3.5.4-bin.zip")).click();*/
		
		
		//data fetching from excel
		//===============================
		/*String Exclpath="C:\\Users\\bibek\\eclipse-workspace\\Sel_Pro\\DataDrvnExcl.xlsx";
		FileInputStream fis = new FileInputStream(".//DataDrvnExcl.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r = sh.getRow(0); 
		Cell c = r.getCell(0);
		String data= c.getStringCellValue();
		int cn= r.getLastCellNum();
		System.out.println(cn);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		String path=".//DataDrvnExcl.xlsx";
		String data=SampleTest.getData(path, "Sheet1", 0, 0);
		System.out.println(data);
		
		//to get row count
		int rc= SampleTest.getRowCount(path, "Sheet1");
		System.out.println(rc);
		
		//to get cell count
		int cc= SampleTest.getCellCount(path, "Sheet1");
				System.out.println(cc);
		
		
		
		
	}

}
