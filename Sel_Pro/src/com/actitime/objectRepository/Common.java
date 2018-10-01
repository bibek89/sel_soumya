package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common 
{
  @FindBy(id="logoutLink")
  WebElement logot_Link;
  
  public void logOut()
  {
	  logot_Link.click();
  }
}
