package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home 
{
   @FindBy(xpath="//div[text()='Tasks']")
   WebElement clk_Taskimg;
   
   @FindBy(xpath="//div[text()='Users']")
   WebElement usr_Reportimg;
   
   public void navigateToTaskPage()
   {
	   clk_Taskimg.click();
   }
   
   public void navigateToUserPage()
   {
	   usr_Reportimg.click();
   }
}
