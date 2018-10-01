package Batch_Execution_2;

import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;

public class Report_Test extends BaseClass
{
  @Test(groups= {"smokeTest"})
  public void createReport_Test()
  {
	  System.out.println("Execute Create Report Test");
  }
  @Test(groups= {"regressionTest"})
  public void modifyReport_Test()
  {
	  System.out.println("Execute Modify Report Test");
  }
  @Test(groups= {"regressionTest"})
  public void deleteReport_Test()
  {
	  System.out.println("Execute Delete Report Test");
  }
}
