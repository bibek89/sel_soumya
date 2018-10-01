package Batch_Execution;

import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class User_Test extends BaseClass
{
	   @Test(groups= {"smokeTest"})
	   public void createUser_Test()
	   {
		   System.out.println("Execute Create User Test");
	   }
	   @Test(groups= {"regressionTest"})
	   public void modifyUser_Test()
	   {
		   System.out.println("Execute Modify User Test");
	   }
	   @Test(groups= {"regressionTest"})
	   public void deleteUser_Test()
	   {
		   System.out.println("Execute Delete User Test");
	   }
}
