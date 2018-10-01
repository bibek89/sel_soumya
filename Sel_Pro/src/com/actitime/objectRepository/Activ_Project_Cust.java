package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activ_Project_Cust 
{
  @FindBy(xpath="//input[@value='Create New Customer']")
  WebElement cret_New_Cust;
  
  @FindBy(xpath="//input[@value='Create New Project']")
  WebElement cret_New_Pro;
  
  public void navigate_To_CreteNewCust()
  {
	  cret_New_Cust.click();
  }
  
  public void navigate_To_CreteNewProj()
  {
	  cret_New_Pro.click();
  }
}
