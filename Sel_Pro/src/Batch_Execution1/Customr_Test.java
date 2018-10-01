package Batch_Execution1;

import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class Customr_Test extends BaseClass
{
   @Test(groups= {"smokeTest"})
   public void createCustomr_Test()
   {
	   System.out.println("Execute Create Customr Test");
   }
   @Test(groups= {"regressionTest"})
   public void modifyCustomr_Test()
   {
	   System.out.println("Execute Modify Customer Test");
   }
   @Test(groups= {"regressionTest"})
   public void deleteCustomr_Test()
   {
	   System.out.println("Execute Delete Customer Test");
   }
}
