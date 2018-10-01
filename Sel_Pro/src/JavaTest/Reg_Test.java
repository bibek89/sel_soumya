package JavaTest;

import org.testng.annotations.Test;

public class Reg_Test 
{
   @Test(groups= {"SmokeTest"})
   public void f()
   {
	   System.out.println("Regression Test");
   }
}
