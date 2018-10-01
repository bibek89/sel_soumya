package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_New_Customer 
{
   @FindBy(name="name")
   WebElement cret_Cust_Nam;
   
   @FindBy(name="description")
   WebElement cust_Desc;
   
   @FindBy(name="createCustomerSubmit")
   WebElement cret_Cust_Submt;
   
   public void cretCustomr(String custoName)
   {
	   cret_Cust_Nam.sendKeys(custoName);
	   cret_Cust_Submt.click();
   }
   
   public void cretCustomr(String custoName,String CustDesc)
   {
	   cret_Cust_Nam.sendKeys(custoName);
	   cust_Desc.sendKeys(custoName);
	   cret_Cust_Submt.click();
   }
}
