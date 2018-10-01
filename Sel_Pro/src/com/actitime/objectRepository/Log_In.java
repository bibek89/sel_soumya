package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Log_In 
{
   @FindBy(name="username")
   private WebElement userEdit;
   
   @FindBy(name="pwd")
   private WebElement pwdEdit;
   
   @FindBy(id="loginButton")
   private WebElement login_Edit;
   
   @FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
   private WebElement errMsg;
   
   
   
   public WebElement getUserEdit() 
    {
		return userEdit;
	}

	public WebElement getPwdEdit() 
	{
		return pwdEdit;
	}

	public WebElement getLogin_Edit() 
	{
		return login_Edit;
	}

	public WebElement getErrMsg() 
	{
		return errMsg;
	}
   
   
   
   
   
   
   
   
   
   
   
   //method overloading
   public void logIn(String userName,String Pwd)
   {
	   userEdit.sendKeys(userName);
	   pwdEdit.sendKeys(Pwd);
	   login_Edit.click();
   }
   
   public void logIn()
   {
	   userEdit.sendKeys("Admin");
	   pwdEdit.sendKeys("manager");
	   login_Edit.click();
   }











}
