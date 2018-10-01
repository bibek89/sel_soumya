package com.actitime.custTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileData;
import com.actitime.objectRepository.Activ_Project_Cust;
import com.actitime.objectRepository.Create_New_Customer;
import com.actitime.objectRepository.Home;
import com.actitime.objectRepository.OpenTask;

public class CustomerProject_Test extends BaseClass 
{
    FileData lib = new FileData();
    
    @Test
    public void createCustomr_Test() throws Throwable
    {
    	//Read test case data from excel
    	
    	String c_Name=lib.getExcelData("Sheet2", 1, 2);
    	
    	//Navigte to Task page
    	
    	Home h_page= PageFactory.initElements(driver, Home.class);
    	
    	h_page.navigateToTaskPage();
    	
    	//navigte to projct and customr page
    	
    	OpenTask oTPage=PageFactory.initElements(driver, OpenTask.class);
    	
    	oTPage.navigtetoproandCustpage();
    	
    	//Navigt to Create new Customr Page
    	
    	Activ_Project_Cust actv_Cust_pag=PageFactory.initElements(driver, Activ_Project_Cust.class);
    	
    	actv_Cust_pag.navigate_To_CreteNewCust();
    	
    	//Crete Customr
    	
    	Create_New_Customer cret_Custmr=PageFactory.initElements(driver, Create_New_Customer.class);
    	
    	cret_Custmr.cretCustomr(c_Name);
    	
    	
    }
    @Test
    public void creteNewCustomrWithDesc() throws Throwable
    {
    	//Read Test case Data From Excel
    	
    	String c_Nm=lib.getExcelData("Sheet2", 2, 2);
    	String c_NmWithDesc= lib.getExcelData("Sheet2", 2, 3);
    	
    	//Navigate to Task Page
    	
    	Home hpage=PageFactory.initElements(driver, Home.class);
    	
    	hpage.navigateToTaskPage();
    	
    	//Naviget to project and customr
    	
    	OpenTask opt_Page=PageFactory.initElements(driver, OpenTask.class);
    	
    	opt_Page.navigtetoproandCustpage();
    	
    	//Navigate to New customr page
    	
    	Activ_Project_Cust actpro_Cust=PageFactory.initElements(driver, Activ_Project_Cust.class);
    	
    	actpro_Cust.navigate_To_CreteNewCust();
    	
    	//crete new Customr along with desc
    	
    	Create_New_Customer crteNewCust= PageFactory.initElements(driver, Create_New_Customer.class);
    	
    	crteNewCust.cretCustomr(c_Nm, c_NmWithDesc);
    	
    	
    }
}
