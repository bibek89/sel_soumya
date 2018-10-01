package selenium_pac;

import org.testng.annotations.Test;

public class Sampl_Test 
{
	@Test(priority=3)
	public void createCust_Test()
	{
		System.out.println("Execute Create Customr Test");
	}
	@Test(invocationCount=2,priority=1)
	public void modifyCust_Test()
	{
		System.out.println("Execute Modify Customr Test");
	}
    @Test(priority=2)
    public void deleteCust_Test()
    {
    	System.out.println("Execute Delete Customer Test");
    }
}
