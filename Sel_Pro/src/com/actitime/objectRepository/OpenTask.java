package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask
{
  @FindBy(linkText="Projects & Customers")
  WebElement projct_and_cust_Link;
  
  public void navigtetoproandCustpage()
  {
	  projct_and_cust_Link.click();
  }
}
